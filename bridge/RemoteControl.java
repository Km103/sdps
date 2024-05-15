package bridge;

public abstract class RemoteControl {
    protected Device device;

    public RemoteControl(Device device) {
        this.device = device;
    }

    public abstract void power();

    public abstract void volumeUp();

    public abstract void volumeDown();
}
