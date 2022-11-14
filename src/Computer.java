public class Computer {
    public String name;
    public Monitor monitor;
    public Mouse mouse;
    public Keyboard keyboard;
    public VideoCard videoCard;
    public CPU cpu;

    public Computer(String name, Monitor monitor, Mouse mouse, Keyboard keyboard, VideoCard videoCard, CPU cpu){
        this.name = name;
        this.monitor = monitor;
        this.mouse = mouse;
        this.keyboard = keyboard;
        this.videoCard = videoCard;
        this.cpu = cpu;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Mouse getMouse() {
        return mouse;
    }

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    public VideoCard getVideoCard() {
        return videoCard;
    }

    public void setVideoCard(VideoCard videoCard) {
        this.videoCard = videoCard;
    }

    public CPU getCpu() {
        return cpu;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }
    @Override
    public String toString(){
        return "\nComputer name: " + getName()+ "\n" + getMonitor() + "\n" + getMouse() + "\n" + getKeyboard() + "\n" + getVideoCard() + "\n" + getCpu();
    }




}
