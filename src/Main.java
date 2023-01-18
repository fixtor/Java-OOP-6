import Controller.UnlockerFaceID;
import Controller.UnlockerFingerPrint;
import Controller.UnlockerPin;
import Model.UnlockerIntarface;

<<<<<<< HEAD
import java.util.ArrayList;
import java.util.List;

=======
>>>>>>> 195462236cb22fe89b5bb72d4492bb9165d3359a
//В пакете Model содержится старый класс
//В пакете Controller содержится новая реализация интерфейса SOLID
public class Main {
	public static void main(String[] args) {
<<<<<<< HEAD
		//Задание 1
=======

>>>>>>> 195462236cb22fe89b5bb72d4492bb9165d3359a
		UnlockerIntarface unlockerIntarfacePIN = new UnlockerPin(123); //Вызов по PIN
		UnlockerIntarface unlockerIntarfaceID = new UnlockerFaceID("ЛИЦО"); //Вызов FaceID
		UnlockerIntarface unlockerIntarfaceFinger = new UnlockerFingerPrint("Отпечаток"); //Вызов отпечаток

		unlockerIntarfaceFinger.Unlock(unlockerIntarfaceFinger);
		unlockerIntarfaceID.Unlock(unlockerIntarfaceID);
		unlockerIntarfacePIN.Unlock(unlockerIntarfacePIN);
<<<<<<< HEAD
		// Конец Задания 1

		// Задание 2
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);

		MutableList mutableList = new MutableList(list);
		mutableList.newValue = 15;
		mutableList.setIndex(2);
		mutableList.getSize(list); //Размер, 3
		mutableList.getIndex(list); // элемент по индексу 2
		mutableList.setNewValue(list, 150); // добавили 150 по индексу 2
		mutableList.addNewValue(list); // добавили 150 в конец
		mutableList.removeValue(list); // удалили с конца 150

		ImmutableListCollection immutableListCollection = new ImmutableListCollection(list);
		immutableListCollection.getSize(list); //Получили размер = 3 элемента
		immutableListCollection.setIndex(0);
		immutableListCollection.getIndex(list); // получили элемент 0 позиции 10

		//Создаем абстрактный класс, в котором общие 2 метода! extends AbstractMutImmeteList
=======
>>>>>>> 195462236cb22fe89b5bb72d4492bb9165d3359a
	}
}