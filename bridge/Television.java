package bridge;

public class Television implements Device {
    private boolean on = false;
    private int volume = 30;
    private String name = "Television";

    @Override
    public boolean isEnabled() {
        return on;
    }

    @Override
    public void togglePower() {
        on = !on;
        System.out.println(name + (on ? " is now ON" : " is now OFF"));
    }

    @Override
    public int getVolume() {
        return volume;
    }

    @Override
    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println(name + " volume set to " + this.volume);
    }

    @Override
    public String getName() {
        return name;
    }
}
