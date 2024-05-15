package state;

class YellowState implements TrafficLightState {
    @Override
    public void handle(TrafficLightContext context) {
        System.out.println("Yellow Light - Prepare to Stop");
        context.setState(new RedState());
    }
}
