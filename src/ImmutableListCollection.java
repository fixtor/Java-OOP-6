import java.util.List;

public class ImmutableListCollection extends AbstractMutImmeteList{

	private List<Integer> immutableList;
	private int index;

	public ImmutableListCollection(List<Integer> immutableList) {
		this.immutableList = immutableList;
	}

	public void getSize(List<Integer> immutableList){
		System.out.println(immutableList.size());
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public void getIndex(List<Integer> immutableList){
		System.out.println(immutableList.get(this.index));
	}
}
