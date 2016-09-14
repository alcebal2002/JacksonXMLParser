public class RiskPoint
{
    private String zref;

    private String valueCcy;

    private String value;

    private String xref;

    private String yref;

    private String recId;

    private String z;

    private String y;

    private String x;

    public String getZref ()
    {
        return zref;
    }

    public void setZref (String zref)
    {
        this.zref = zref;
    }

    public String getValueCcy ()
    {
        return valueCcy;
    }

    public void setValueCcy (String valueCcy)
    {
        this.valueCcy = valueCcy;
    }

    public String getValue ()
    {
        return value;
    }

    public void setValue (String value)
    {
        this.value = value;
    }

    public String getXref ()
    {
        return xref;
    }

    public void setXref (String xref)
    {
        this.xref = xref;
    }

    public String getYref ()
    {
        return yref;
    }

    public void setYref (String yref)
    {
        this.yref = yref;
    }

    public String getRecId ()
    {
        return recId;
    }

    public void setRecId (String recId)
    {
        this.recId = recId;
    }

    public String getZ ()
    {
        return z;
    }

    public void setZ (String z)
    {
        this.z = z;
    }

    public String getY ()
    {
        return y;
    }

    public void setY (String y)
    {
        this.y = y;
    }

    public String getX ()
    {
        return x;
    }

    public void setX (String x)
    {
        this.x = x;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [zref = "+zref+", valueCcy = "+valueCcy+", value = "+value+", xref = "+xref+", yref = "+yref+", recId = "+recId+", z = "+z+", y = "+y+", x = "+x+"]";
    }
}
