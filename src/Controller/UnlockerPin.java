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
<<<<<<< HEAD
=======

>>>>>>> 195462236cb22fe89b5bb72d4492bb9165d3359a
	}

	@Override
	public String toString() {
		return "UnlockerPin{" +
				"pin=" + pin +
				'}';
	}
}
