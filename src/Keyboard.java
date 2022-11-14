public class Keyboard  {
    public String name;
    public int numbersOfBacklight;
    public int numberOfKeys;
    public Keyboard(String name, int numbersOfBacklight,int numberOfKeys) {
        this.name = name;
        this.numbersOfBacklight = numbersOfBacklight;
        this.numberOfKeys = numberOfKeys;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfKeys() {
        return numberOfKeys;
    }

    public void setNumberOfKeys(int numberOfKeys) {
        this.numberOfKeys = numberOfKeys;
    }

    public int getNumbersOfBacklight() {
        return numbersOfBacklight;
    }

    public void setNumbersOfBacklight(int numbersOfBacklight) {
        this.numbersOfBacklight = numbersOfBacklight;
    }

    @Override
    public String toString() {
        return "\nName: " + getName() + ", number of keys: " + getNumberOfKeys() + ", number of backlight: " + getNumbersOfBacklight() + "";
    }
}
