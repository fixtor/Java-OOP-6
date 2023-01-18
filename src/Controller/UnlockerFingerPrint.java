package Controller;


import Model.UnlockerIntarface;

public class UnlockerFingerPrint implements UnlockerIntarface {

	private String fingerPrint;

	public UnlockerFingerPrint(String fingerPrint) {
		this.fingerPrint = fingerPrint;
	}

	@Override
	public <T> void Unlock(T userInput) {
		System.out.println("Открыт по отпечатку пальца: " + userInput);
	}

	@Override
	public String toString() {
		return "UnlockerFingerPrint{" +
				"fingerPrint='" + fingerPrint + '\'' +
				'}';
	}
}
