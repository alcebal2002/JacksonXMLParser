public class Book
{
    private String underlyingRiskBook;

    private String tradeBook;

    private String legalEntity;

    private String germanBankingTrading;

    private String riskBook;

    private Trade[] trade;

    private String localBankingTrading;

    private String managementArea;

    private String tradeBookUBR;

    private String desk;

    private String glRegion;

    private String settlementBook;

    public String getUnderlyingRiskBook ()
    {
        return underlyingRiskBook;
    }

    public void setUnderlyingRiskBook (String underlyingRiskBook)
    {
        this.underlyingRiskBook = underlyingRiskBook;
    }

    public String getTradeBook ()
    {
        return tradeBook;
    }

    public void setTradeBook (String tradeBook)
    {
        this.tradeBook = tradeBook;
    }

    public String getLegalEntity ()
    {
        return legalEntity;
    }

    public void setLegalEntity (String legalEntity)
    {
        this.legalEntity = legalEntity;
    }

    public String getGermanBankingTrading ()
    {
        return germanBankingTrading;
    }

    public void setGermanBankingTrading (String germanBankingTrading)
    {
        this.germanBankingTrading = germanBankingTrading;
    }

    public String getRiskBook ()
    {
        return riskBook;
    }

    public void setRiskBook (String riskBook)
    {
        this.riskBook = riskBook;
    }

    public Trade[] getTrade ()
    {
        return trade;
    }

    public void setTrade (Trade[] trade)
    {
        this.trade = trade;
    }

    public String getLocalBankingTrading ()
    {
        return localBankingTrading;
    }

    public void setLocalBankingTrading (String localBankingTrading)
    {
        this.localBankingTrading = localBankingTrading;
    }

    public String getManagementArea ()
    {
        return managementArea;
    }

    public void setManagementArea (String managementArea)
    {
        this.managementArea = managementArea;
    }

    public String getTradeBookUBR ()
    {
        return tradeBookUBR;
    }

    public void setTradeBookUBR (String tradeBookUBR)
    {
        this.tradeBookUBR = tradeBookUBR;
    }

    public String getDesk ()
    {
        return desk;
    }

    public void setDesk (String desk)
    {
        this.desk = desk;
    }

    public String getGlRegion ()
    {
        return glRegion;
    }

    public void setGlRegion (String glRegion)
    {
        this.glRegion = glRegion;
    }

    public String getSettlementBook ()
    {
        return settlementBook;
    }

    public void setSettlementBook (String settlementBook)
    {
        this.settlementBook = settlementBook;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [underlyingRiskBook = "+underlyingRiskBook+", tradeBook = "+tradeBook+", legalEntity = "+legalEntity+", germanBankingTrading = "+germanBankingTrading+", riskBook = "+riskBook+", trade = "+trade+", localBankingTrading = "+localBankingTrading+", managementArea = "+managementArea+", tradeBookUBR = "+tradeBookUBR+", desk = "+desk+", glRegion = "+glRegion+", settlementBook = "+settlementBook+"]";
    }
}