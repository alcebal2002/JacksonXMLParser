public class MIS3File
{
    private String signOffGroup;

    private String yieldCurveRateSetId;

    private String fileLocation;

    private String fxVolatilityRateSetId;

    private String commodityRateSetId;

    private String rateSetId;

    private String runType;

    private String location;

    private String department;

    private String signOffBy;

    private Book[] book;

    private String creationTime;

    private String runId;

    private String contentType;

    private String cobDate;

    private String version;

    public String getSignOffGroup ()
    {
        return signOffGroup;
    }

    public void setSignOffGroup (String signOffGroup)
    {
        this.signOffGroup = signOffGroup;
    }

    public String getYieldCurveRateSetId ()
    {
        return yieldCurveRateSetId;
    }

    public void setYieldCurveRateSetId (String yieldCurveRateSetId)
    {
        this.yieldCurveRateSetId = yieldCurveRateSetId;
    }

    public String getFileLocation ()
    {
        return fileLocation;
    }

    public void setFileLocation (String fileLocation)
    {
        this.fileLocation = fileLocation;
    }

    public String getFxVolatilityRateSetId ()
    {
        return fxVolatilityRateSetId;
    }

    public void setFxVolatilityRateSetId (String fxVolatilityRateSetId)
    {
        this.fxVolatilityRateSetId = fxVolatilityRateSetId;
    }

    public String getCommodityRateSetId ()
    {
        return commodityRateSetId;
    }

    public void setCommodityRateSetId (String commodityRateSetId)
    {
        this.commodityRateSetId = commodityRateSetId;
    }

    public String getRateSetId ()
    {
        return rateSetId;
    }

    public void setRateSetId (String rateSetId)
    {
        this.rateSetId = rateSetId;
    }

    public String getRunType ()
    {
        return runType;
    }

    public void setRunType (String runType)
    {
        this.runType = runType;
    }

    public String getLocation ()
    {
        return location;
    }

    public void setLocation (String location)
    {
        this.location = location;
    }

    public String getDepartment ()
    {
        return department;
    }

    public void setDepartment (String department)
    {
        this.department = department;
    }

    public String getSignOffBy ()
    {
        return signOffBy;
    }

    public void setSignOffBy (String signOffBy)
    {
        this.signOffBy = signOffBy;
    }

    public Book[] getBook ()
    {
        return book;
    }

    public void setBook (Book[] book)
    {
        this.book = book;
    }

    public String getCreationTime ()
    {
        return creationTime;
    }

    public void setCreationTime (String creationTime)
    {
        this.creationTime = creationTime;
    }

    public String getRunId ()
    {
        return runId;
    }

    public void setRunId (String runId)
    {
        this.runId = runId;
    }

    public String getContentType ()
    {
        return contentType;
    }

    public void setContentType (String contentType)
    {
        this.contentType = contentType;
    }

    public String getCobDate ()
    {
        return cobDate;
    }

    public void setCobDate (String cobDate)
    {
        this.cobDate = cobDate;
    }

    public String getVersion ()
    {
        return version;
    }

    public void setVersion (String version)
    {
        this.version = version;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [signOffGroup = "+signOffGroup+", yieldCurveRateSetId = "+yieldCurveRateSetId+", fileLocation = "+fileLocation+", fxVolatilityRateSetId = "+fxVolatilityRateSetId+", commodityRateSetId = "+commodityRateSetId+", rateSetId = "+rateSetId+", runType = "+runType+", location = "+location+", department = "+department+", signOffBy = "+signOffBy+", book = "+book+", creationTime = "+creationTime+", runId = "+runId+", contentType = "+contentType+", cobDate = "+cobDate+", version = "+version+"]";
    }
}