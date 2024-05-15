package state;

// Context
class TrafficLightContext {
    private TrafficLightState state;

    public TrafficLightContext(TrafficLightState state) {
        this.state = state;
    }

    public void setState(TrafficLightState state) {
        this.state = state;
    }

    public void request() {
        state.handle(this);
    }
}