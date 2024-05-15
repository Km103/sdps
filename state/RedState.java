package state;

// Concrete States
class RedState implements TrafficLightState {
    @Override
    public void handle(TrafficLightContext context) {
        System.out.println("Red Light - Stop");
        context.setState(new GreenState());
    }
}
