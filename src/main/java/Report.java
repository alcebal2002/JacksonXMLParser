public class Report
{
    private String sector;

    private RiskPoint[] riskPoint;

    private String refCurve;

    private String isSkewValue;

    private String riskId;

    private String subReportClass;

    private String refCurveInfo;

    private String inSVM;

    private String valuationSource;

    private String riskCurrency;

    private String countryOfIssuer;

    private String refCurveClass;

    private String creditCurveFull;

    private String blend;

    private String fxCcyPair;

    private String reportName;

    private String reportClass;

    public String getSector ()
    {
        return sector;
    }

    public void setSector (String sector)
    {
        this.sector = sector;
    }

    public RiskPoint[] getRiskPoint ()
    {
        return riskPoint;
    }

    public void setRiskPoint (RiskPoint[] riskPoint)
    {
        this.riskPoint = riskPoint;
    }

    public String getRefCurve ()
    {
        return refCurve;
    }

    public void setRefCurve (String refCurve)
    {
        this.refCurve = refCurve;
    }

    public String getIsSkewValue ()
    {
        return isSkewValue;
    }

    public void setIsSkewValue (String isSkewValue)
    {
        this.isSkewValue = isSkewValue;
    }

    public String getRiskId ()
    {
        return riskId;
    }

    public void setRiskId (String riskId)
    {
        this.riskId = riskId;
    }

    public String getSubReportClass ()
    {
        return subReportClass;
    }

    public void setSubReportClass (String subReportClass)
    {
        this.subReportClass = subReportClass;
    }

    public String getRefCurveInfo ()
    {
        return refCurveInfo;
    }

    public void setRefCurveInfo (String refCurveInfo)
    {
        this.refCurveInfo = refCurveInfo;
    }

    public String getInSVM ()
    {
        return inSVM;
    }

    public void setInSVM (String inSVM)
    {
        this.inSVM = inSVM;
    }

    public String getValuationSource ()
    {
        return valuationSource;
    }

    public void setValuationSource (String valuationSource)
    {
        this.valuationSource = valuationSource;
    }

    public String getRiskCurrency ()
    {
        return riskCurrency;
    }

    public void setRiskCurrency (String riskCurrency)
    {
        this.riskCurrency = riskCurrency;
    }

    public String getCountryOfIssuer ()
    {
        return countryOfIssuer;
    }

    public void setCountryOfIssuer (String countryOfIssuer)
    {
        this.countryOfIssuer = countryOfIssuer;
    }

    public String getRefCurveClass ()
    {
        return refCurveClass;
    }

    public void setRefCurveClass (String refCurveClass)
    {
        this.refCurveClass = refCurveClass;
    }

    public String getCreditCurveFull ()
    {
        return creditCurveFull;
    }

    public void setCreditCurveFull (String creditCurveFull)
    {
        this.creditCurveFull = creditCurveFull;
    }

    public String getBlend ()
    {
        return blend;
    }

    public void setBlend (String blend)
    {
        this.blend = blend;
    }

    public String getFxCcyPair ()
    {
        return fxCcyPair;
    }

    public void setFxCcyPair (String fxCcyPair)
    {
        this.fxCcyPair = fxCcyPair;
    }

    public String getReportName ()
    {
        return reportName;
    }

    public void setReportName (String reportName)
    {
        this.reportName = reportName;
    }

    public String getReportClass ()
    {
        return reportClass;
    }

    public void setReportClass (String reportClass)
    {
        this.reportClass = reportClass;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [sector = "+sector+", riskPoint = "+riskPoint+", refCurve = "+refCurve+", isSkewValue = "+isSkewValue+", riskId = "+riskId+", subReportClass = "+subReportClass+", refCurveInfo = "+refCurveInfo+", inSVM = "+inSVM+", valuationSource = "+valuationSource+", riskCurrency = "+riskCurrency+", countryOfIssuer = "+countryOfIssuer+", refCurveClass = "+refCurveClass+", creditCurveFull = "+creditCurveFull+", blend = "+blend+", fxCcyPair = "+fxCcyPair+", reportName = "+reportName+", reportClass = "+reportClass+"]";
    }
}