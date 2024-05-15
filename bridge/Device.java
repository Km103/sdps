package bridge;

public interface Device {
    boolean isEnabled();

    void togglePower();

    int getVolume();

    void setVolume(int volume);

    String getName();
}
