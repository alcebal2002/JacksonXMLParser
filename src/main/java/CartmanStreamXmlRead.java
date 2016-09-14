import java.io.File; 
import java.io.FileInputStream; 
import java.io.FileNotFoundException; 
import java.util.ArrayList; 
import java.util.HashMap; 
import java.util.Map.Entry; 
import java.util.Scanner; 
import java.util.concurrent.TimeUnit; 

import javax.xml.stream.XMLInputFactory; 
import javax.xml.stream.XMLStreamReader; 

import com.fasterxml.jackson.databind.DeserializationFeature; 
import com.fasterxml.jackson.dataformat.xml.JacksonXmlModule; 
import com.fasterxml.jackson.dataformat.xml.XmlMapper; 

public class CartmanStreamXmlRead { 
        
        public static void main(String[] args) { 

                long totalStartTime = 0; 
                long totalStopTime = 0; 
                int totalFilesparsed = 0; 

                totalStartTime = System.currentTimeMillis(); 
                
                String projectPath = System.getProperty("user.dir"); 
                System.out.println(projectPath); 

                // Read MIS3_Config file 
                // Cob~FileName~TradeId 
                
                Scanner mis3ConfigFileScanner; 
                String cob,fileName,tradeId; 
                
                HashMap<String,ArrayList<String>> requestMap = new HashMap<String,ArrayList<String>>(); 
                
                try { 
                        mis3ConfigFileScanner = new Scanner (new File(projectPath + File.separator + "/src/main/resources/MIS3_Config.txt")); 
                        mis3ConfigFileScanner.useDelimiter("~|\r?\n|\r"); 

                        while (mis3ConfigFileScanner.hasNext() ) { 
                                cob = mis3ConfigFileScanner.next(); 
                                fileName = mis3ConfigFileScanner.next(); 
                                tradeId = mis3ConfigFileScanner.next(); 
                                
                                if (!requestMap.containsKey(fileName)) { 
                                        requestMap.put(fileName, new ArrayList<String>()); 
                                } 
                                requestMap.get(fileName).add(tradeId); 
                        } 
                        mis3ConfigFileScanner.close(); 
                        
                        for (Entry<String, ArrayList<String>> entry : requestMap.entrySet()) { 
                                String portFolioName = entry.getKey(); 
                                ArrayList<String> tradeIds = entry.getValue(); 
                                
                                parseXMLFile (projectPath, portFolioName, tradeIds); 
                                totalFilesparsed++; 
                                
                        } 
                        
                        totalStopTime = System.currentTimeMillis(); 

                        long millis = totalStopTime - totalStartTime; 
                        long seconds = TimeUnit.MILLISECONDS.toSeconds(millis); 
                        
                        System.out.println ("**********************************************************************"); 
                        System.out.println ("Files parsed : " + totalFilesparsed); 
                        System.out.println ("Elapsed time : " + millis + " ms - (" + seconds + " secs)"); 
                        System.out.println ("**********************************************************************"); 

                } catch (FileNotFoundException e) { 
                        // TODO Auto-generated catch block 
                        e.printStackTrace(); 
                } 
        } 

        public static void parseXMLFile (final String projectPath, final String portFolioName, final ArrayList<String> tradeIds) { 
                long startTime = 0; 
                long stopTime = 0; 
                int counter = 0; 
                
                startTime = System.currentTimeMillis(); 

                File xmlFile = new File(projectPath + File.separator + "/src/main/resources/" + portFolioName); 

                if (xmlFile.exists()) { 
                
                        //System.out.println(xmlFile); 
                        System.out.println ("Parsing " + portFolioName + " " + tradeIds.toString()); 
                        XMLInputFactory f = XMLInputFactory.newInstance(); 
        
                        try { 
                                XMLStreamReader sr = f.createXMLStreamReader(new FileInputStream(xmlFile)); 
        
                                JacksonXmlModule module = new JacksonXmlModule(); 
                                module.setDefaultUseWrapper(false); 
                                XmlMapper xmlMapper = new XmlMapper(module); 
                                xmlMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false); 
        
                                sr.next(); // to point to <root> 
                                MIS3File mis3File = xmlMapper.readValue(sr, MIS3File.class); 
        
                                Book[] books = mis3File.getBook(); 
                                //System.out.println ("COB~TRADEID~ROLLUPNAME~MATURITYDATE~NOTIONAL~NOTIONALCURRENCY~CURRENTNOTIONAL~RATE~REFCURVE~RISKBOOK~TRADEBOOK~CCY~PRICE_CLEAN_COB_TODAY_PLUS_ADJ~PRICE_COB_TODAY_PLUS_ADJ~PRICE_CLEAN_COB_TODAY~PRICE_COB_TODAY~PV_ADJ_TRADE_TODAY~PRICE_ACCRUAL~PRICE_CARRY_TODAY~MATURITYSPREAD_BP_TODAY~SKEW_PV_ADJ_TOTAL_TODAY.1~PVADJ_TODAY~SUBTRADE_NOTIONAL~PRICE_COB_TODAY_SKEW~PV_PREMIUM_SKEW~RISKTRADE~STRUCTUREID~LINKAGEREFERENCE~PRODUCTTYPE~CLIENTFACINGID~LINKAGEREFERENCE2~COMMONREFERENCE~ALTTRADEINFO~CREATIONTIME"); 
        
                                //List<ReportRow> reportRowList = new ArrayList<ReportRow>(); 
                                ReportRow reportRow; 
                                
                                for (Book book : books) { 
        //                                System.out.println("Trade Book: " + book.getTradeBook() + "  ||" + "  Risk Book: " + book.getRiskBook() + "    ||" + "  Settlement Book: " + book.getSettlementBook()); 
                                        Trade[] trades = book.getTrade(); 
        //                                System.out.println("  total trades: " + trades.length); 
                                        for (Trade trade : trades) { 
        //                                        System.out.println("  Trade Source: " + trade.getTradeSource() + "  ||" + "  Notional: " + trade.getNotional()); 
                                                
                                                if (tradeIds.contains(trade.getTradeId())) { 
                                                
                                                        reportRow = new ReportRow(); 
                                                        reportRow.setCob(mis3File.getCobDate()); 
                                                        reportRow.setCreationtime(mis3File.getCreationTime()); 
                                                        
                                                        reportRow.setRiskbook(book.getRiskBook()); 
                                                        reportRow.setTradebook(book.getTradeBook()); 
                                                        reportRow.setRollupname(book.getTradeBook()); 
                
                                                        reportRow.setTradeid(trade.getTradeId()); 
                                                        reportRow.setMaturitydate(trade.getMaturityDate()); 
                                                        reportRow.setNotional(trade.getNotional()); 
                                                        reportRow.setNotionalcurrency(trade.getNotionalCurrency()); 
                                                        reportRow.setCurrentnotional(trade.getCurrentNotional()); 
                                                        reportRow.setRate(trade.getRate()); 
                                                        reportRow.setStructureid(trade.getStructureId()); 
                                                        reportRow.setLinkagereference(trade.getLinkageReference()); 
                                                        reportRow.setProducttype(trade.getProductType()); 
                                                        reportRow.setClientfacingid(trade.getClientFacingId()); 
                                                        reportRow.setLinkagereference2(trade.getLinkageReference2()); 
                                                        reportRow.setCommonreference(trade.getCommonReference()); 
                                                        reportRow.setAlttradeinfo(trade.getAltTradeInfo()); 
                                                        
                                                        Subtrade[] subtrades = trade.getSubtrade(); 
                                                        
                                                        for (Subtrade subtrade : subtrades) { 
                                                                
                                                                reportRow.setRisktrade(subtrade.getRiskTrade()); 
                                                                                                                
                                                                Reportcollection reportCollection = subtrade.getReportcollection(); 
                                                                
                                                                Report[] reports = reportCollection.getReport(); 
                                                                
                                                                for (Report report : reports) { 
                                                                        
                                                                        if ((report.getReportName()).toUpperCase().matches("PRICE_CLEAN_COB_TODAY_PLUS_ADJ|"+ 
                                                                                                                                                   "PRICE_COB_TODAY_PLUS_ADJ|"+ 
                                                                                                                                                   "PRICE_CLEAN_COB_TODAY|"+ 
                                                                                                                                                   "PRICE_COB_TODAY|"+ 
                                                                                                                                                   "PV_ADJ_TRADE_TODAY|"+ 
                                                                                                                                                   "PRICE_ACCRUAL|"+ 
                                                                                                                                                   "PRICE_CARRY_TODAY|"+ 
                                                                                                                                                   "MATURITYSPREAD_BP_TODAY|"+ 
                                                                                                                                                   "SKEW_PV_ADJ_TOTAL_TODAY.1|"+ 
                                                                                                                                                   "PVADJ_TODAY|"+ 
                                                                                                                                                   "SUBTRADE_NOTIONAL|"+ 
                                                                                                                                                   "PRICE_COB_TODAY_SKEW|"+ 
                                                                                                                                                   "PV_PREMIUM_SKEW")) { 
                                                                                
                                                                                reportRow.setRefcurve(report.getRefCurve()); 
                                                                                
                                                                                RiskPoint[] riskpoints = report.getRiskPoint(); 
                                                                                
                                                                                for (RiskPoint riskpoint : riskpoints) { 
                                                                                        switch ((report.getReportName()).toUpperCase()) { 
                                                                                        case "PRICE_CLEAN_COB_TODAY_PLUS_ADJ": 
                                                                                                reportRow.setPrice_clean_cob_today_plus_adj(riskpoint.getValue()); 
                                                                                                break; 
                                                                                        case "PRICE_COB_TODAY_PLUS_ADJ": 
                                                                                                reportRow.setPrice_cob_today_plus_adj(riskpoint.getValue()); 
                                                                                                break; 
                                                                                        case "PRICE_CLEAN_COB_TODAY": 
                                                                                                reportRow.setPrice_clean_cob_today(riskpoint.getValue()); 
                                                                                                break; 
                                                                                        case "PRICE_COB_TODAY": 
                                                                                                reportRow.setPrice_cob_today(riskpoint.getValue()); 
                                                                                                break; 
                                                                                        case "PV_ADJ_TRADE_TODAY": 
                                                                                                reportRow.setPv_adj_trade_today(riskpoint.getValue()); 
                                                                                                break; 
                                                                                        case "PRICE_ACCRUAL": 
                                                                                                reportRow.setPrice_accrual(riskpoint.getValue()); 
                                                                                                break; 
                                                                                        case "PRICE_CARRY_TODAY": 
                                                                                                reportRow.setPrice_carry_today(riskpoint.getValue()); 
                                                                                                break; 
                                                                                        case "MATURITYSPREAD_BP_TODAY": 
                                                                                                reportRow.setMaturityspread_bp_today(riskpoint.getValue()); 
                                                                                                break; 
                                                                                        case "SKEW_PV_ADJ_TOTAL_TODAY.1": 
                                                                                                reportRow.setSkew_pv_adj_total_today_1(riskpoint.getValue()); 
                                                                                                break; 
                                                                                        case "PVADJ_TODAY": 
                                                                                                reportRow.setPvadj_today(riskpoint.getValue()); 
                                                                                                break; 
                                                                                        case "SUBTRADE_NOTIONAL": 
                                                                                                reportRow.setSubtrade_notional(riskpoint.getValue()); 
                                                                                                break; 
                                                                                        case "PRICE_COB_TODAY_SKEW": 
                                                                                                reportRow.setPrice_cob_today_skew(riskpoint.getValue()); 
                                                                                                break; 
                                                                                        case "PV_PREMIUM_SKEW": 
                                                                                                reportRow.setPv_premium_skew(riskpoint.getValue()); 
                                                                                                break; 
                                                                                        default: 
                                                                                                break;                                                                         
                                                                                        } 
                                                                                } 
                                                                        } 
                                                                        
                                                                } 
                                                        } 
                                                        
                                                        //reportRowList.add(reportRow); 
                                                        System.out.println("  " + reportRow); 
                                                        counter++; 
                                                } 
                                        } 
                                } 
        
                                sr.close();                 
                                stopTime = System.currentTimeMillis(); 
        
                                long millis = stopTime - startTime; 
                                
                                System.out.println ("  Retrieved: " + counter + " rows (" + millis + " ms)"); 
                                
                        } catch (Exception e) { 
                                e.printStackTrace(); 
                        } 
                } else { 
                        System.out.println ("File " + portFolioName + " does not exist"); 
                } 
        } 
}
