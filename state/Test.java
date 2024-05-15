package state;

public class Test {
    public static void main(String[] args) {
        TrafficLightContext trafficLight = new TrafficLightContext(new RedState());

        for (int i = 0; i < 6; i++) {
            trafficLight.request();
        }
    }
}
