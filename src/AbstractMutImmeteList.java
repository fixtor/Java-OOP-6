import java.util.List;

public abstract class AbstractMutImmeteList {

	private List<Integer> mutableList;
	private int index;

	public void getSize(List<Integer> list) {
		System.out.println(list.size());
	}

	public void  getIndex(List<Integer> list){
		System.out.println(list.get(this.index));
	}
}
