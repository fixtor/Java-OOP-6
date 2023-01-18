package Controller;

import Model.UnlockerIntarface;

public class UnlockerPin implements UnlockerIntarface {

	private int pin;

	public UnlockerPin(int pin) {
		this.pin = pin;
	}

	@Override
	public <T> void Unlock(T userInput) {
		System.out.println("Открыт по PIN: " + userInput);

	}

	@Override
	public String toString() {
		return "UnlockerPin{" +
				"pin=" + pin +
				'}';
	}
}
