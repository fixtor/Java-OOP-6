package Controller;

import Model.UnlockerIntarface;

public class UnlockerFaceID implements UnlockerIntarface {

	private String faceID;

	public UnlockerFaceID(String faceID) {
		this.faceID = faceID;
	}

	@Override
	public <T> void Unlock(T userInput) {
		System.out.println("Открыт по FaceID: "+ userInput);
	}

	@Override
	public String toString() {
		return "UnlockerFaceID{" +
				"faceID='" + faceID + '\'' +
				'}';
	}
}
