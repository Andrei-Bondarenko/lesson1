public class Monitor {
    public String mrName;
    public int responseTime;
    public int updateFrequency;
    public int diagonal;


    public Monitor(String mrName,int responseTime, int updateFrequency,int diagonal) {
        this.mrName = mrName;
        this.responseTime = responseTime;
        this.updateFrequency = updateFrequency;
        this.diagonal = diagonal;
    }
    public String getMrName() {
        return mrName;
    }

    public void setMrName(String mrName) {
        this.mrName = mrName;
    }

    public int getResponseTime() {
        return responseTime;
    }

    public void setResponseTime(int responseTime) {
        this.responseTime = responseTime;
    }

    public int getUpdateFrequency() {
        return updateFrequency;
    }

    public void setUpdateFrequency(int updateFrequency) {
        this.updateFrequency = updateFrequency;
    }

    public int getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(int diagonal) {
        this.diagonal = diagonal;
    }

    @Override
    public String toString() {
        return "\nMonitor: " + getMrName() + ", response: " + getResponseTime() + " ms, update frequency: " + getUpdateFrequency() + " MHz, diagonal: " + getDiagonal() + " inches";
    }
}
