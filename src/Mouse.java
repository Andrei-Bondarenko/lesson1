public class Mouse  {
    public String name;
    public int numberOfButtons;
    public int trackingSpeed;

    public Mouse(String name, int numberOfButtons, int trackingSpeed)  {
        this.name = name;
        this.numberOfButtons = numberOfButtons;
        this.trackingSpeed = trackingSpeed;
    }

    private String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfButtons() {
        return numberOfButtons;
    }

    public void setNumberOfButtons(int numberOfButtons) {
        this.numberOfButtons = numberOfButtons;
    }

    public int getTrackingSpeed() {
        return trackingSpeed;
    }

    public void setTrackingSpeed(int trackingSpeed) {
        this.trackingSpeed = trackingSpeed;
    }

    @Override
    public String toString() {
        return "\nMouse: " + getName() + ", number of buttons: " + getNumberOfButtons() + ", tracking speed: " + getTrackingSpeed() + "MHz";
    }

}
