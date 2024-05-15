package state;

class GreenState implements TrafficLightState {
    @Override
    public void handle(TrafficLightContext context) {
        System.out.println("Green Light - Go");
        context.setState(new YellowState());
    }
}
