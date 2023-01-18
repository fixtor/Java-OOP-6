package Model;

public class Unlocker {
	private int mode; // режим
	private int pin; // на случай пин-кода
	private String fingerprint; // на случай отпечатка пальца
	private String faceID; // на случай лица

	public Unlocker(int mode, int pin, String fingerprint, String faceID) {
		this.mode = mode;
		this.pin = pin;
		this.fingerprint = fingerprint;
		this.faceID = faceID;
	}

	public void setMode(int mode) {
		this.mode = mode;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	public void setFingerprint(String fingerprint) {
		this.fingerprint = fingerprint;
	}

	public void setFaceID(String faceID) {
		this.faceID = faceID;
	}
}
