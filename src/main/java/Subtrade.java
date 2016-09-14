public class Subtrade
{
    private String riskRunVersion;

    private Reportcollection reportcollection;

    private String riskSource;

    private String financialProductType;

    private String riskVersion;

    private String riskGroup;

    private String riskProductType;

    private String riskTrade;

    public String getRiskRunVersion ()
    {
        return riskRunVersion;
    }

    public void setRiskRunVersion (String riskRunVersion)
    {
        this.riskRunVersion = riskRunVersion;
    }

    public Reportcollection getReportcollection ()
    {
        return reportcollection;
    }

    public void setReportcollection (Reportcollection reportcollection)
    {
        this.reportcollection = reportcollection;
    }

    public String getRiskSource ()
    {
        return riskSource;
    }

    public void setRiskSource (String riskSource)
    {
        this.riskSource = riskSource;
    }

    public String getFinancialProductType ()
    {
        return financialProductType;
    }

    public void setFinancialProductType (String financialProductType)
    {
        this.financialProductType = financialProductType;
    }

    public String getRiskVersion ()
    {
        return riskVersion;
    }

    public void setRiskVersion (String riskVersion)
    {
        this.riskVersion = riskVersion;
    }

    public String getRiskGroup ()
    {
        return riskGroup;
    }

    public void setRiskGroup (String riskGroup)
    {
        this.riskGroup = riskGroup;
    }

    public String getRiskProductType ()
    {
        return riskProductType;
    }

    public void setRiskProductType (String riskProductType)
    {
        this.riskProductType = riskProductType;
    }

    public String getRiskTrade ()
    {
        return riskTrade;
    }

    public void setRiskTrade (String riskTrade)
    {
        this.riskTrade = riskTrade;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [riskRunVersion = "+riskRunVersion+", reportcollection = "+reportcollection+", riskSource = "+riskSource+", financialProductType = "+financialProductType+", riskVersion = "+riskVersion+", riskGroup = "+riskGroup+", riskProductType = "+riskProductType+", riskTrade = "+riskTrade+"]";
    }
}