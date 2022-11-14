public class VideoCard {
    public String name;
    public int storage;
    public double length;
    public int videoMemory;
    public int powerConsumption;

    public VideoCard(String name, int storage, double length, int videoMemory, int powerConsumption) {
        this.name = name;
        this.storage = storage;
        this.length = length;
        this.videoMemory = videoMemory;
        this.powerConsumption = powerConsumption;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public int getVideoMemory() {
        return videoMemory;
    }

    public void setVideoMemory(int videoMemory) {
        this.videoMemory = videoMemory;
    }

    public int getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(int powerConsumption) {
        this.powerConsumption = powerConsumption;
    }
    @Override
    public String toString() {
        return "\nName: " + getName() + ", memory: " + getStorage() + " GB, length: " + getLength() + " mm, video memory: " + getVideoMemory() + " MHz, power consumption: " + getPowerConsumption() + " W";
    }
}
