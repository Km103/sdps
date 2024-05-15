package bridge;

public class BridgePatternDemo {
    public static void main(String[] args) {
        Device tv = new Television();
        Device radio = new Radio();

        System.out.println("Tests with basic remote.");
        RemoteControl basicRemote = new BasicRemote(tv);
        basicRemote.power();
        basicRemote.volumeUp();
        basicRemote.volumeDown();

        System.out.println("\nTests with advanced remote.");
        AdvancedRemote advancedRemote = new AdvancedRemote(radio);
        advancedRemote.power();
        advancedRemote.volumeUp();
        advancedRemote.volumeDown();
        advancedRemote.mute();
    }
}
