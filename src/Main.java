import Controller.UnlockerFaceID;
import Controller.UnlockerFingerPrint;
import Controller.UnlockerPin;
import Model.UnlockerIntarface;

//В пакете Model содержится старый класс
//В пакете Controller содержится новая реализация интерфейса SOLID
public class Main {
	public static void main(String[] args) {

		UnlockerIntarface unlockerIntarfacePIN = new UnlockerPin(123); //Вызов по PIN
		UnlockerIntarface unlockerIntarfaceID = new UnlockerFaceID("ЛИЦО"); //Вызов FaceID
		UnlockerIntarface unlockerIntarfaceFinger = new UnlockerFingerPrint("Отпечаток"); //Вызов отпечаток

		unlockerIntarfaceFinger.Unlock(unlockerIntarfaceFinger);
		unlockerIntarfaceID.Unlock(unlockerIntarfaceID);
		unlockerIntarfacePIN.Unlock(unlockerIntarfacePIN);
	}
}