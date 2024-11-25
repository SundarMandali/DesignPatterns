package behavioural.state;

public class Fan {
	private State currentState;

	public Fan() {
		this.currentState = new OffState(); // Initial state
	}

	public void setState(State state) {
		this.currentState = state;
	}

	public void pressButton() {
		currentState.pressButton(this);
	}
}
