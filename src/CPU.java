public class CPU {
    public String cpuName;
    public int numberOfCore;
    public int ratedPower;
    public int memorySize;

    public CPU(String cpuName, int numberOfCore, int ratedPower, int memorySize) {
        this.cpuName = cpuName;
        this.numberOfCore = numberOfCore;
        this.ratedPower = ratedPower;
        this.memorySize = memorySize;
    }

    public String getName() {
        return cpuName;
    }

    public void setName(String name) {
        cpuName = this.cpuName;
    }

    public int getNumberOfCore() {
        return numberOfCore;
    }

    public void setNumberOfCore(int numberOfCore) {
        this.numberOfCore = numberOfCore;
    }

    public int getRatedPower() {
        return ratedPower;
    }

    public void setRatedPower(int ratedPower) {
        this.ratedPower = ratedPower;
    }

    public int getMemorySize() {
        return memorySize;
    }

    public void setMemorySize(int memorySize) {
        this.memorySize = memorySize;
    }

    @Override
    public String toString() {
        return "\nName: " + getName() + ", number of core: " + getNumberOfCore() + " cores, rated power: " + getRatedPower() + " MHz, memory size: " + getMemorySize() + " GB";
    }

}
