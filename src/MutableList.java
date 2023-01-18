import java.util.List;

public class MutableList extends AbstractMutImmeteList{
	private List<Integer> mutableList;
	int index;
	int newValue;

	public MutableList(List<Integer> mutableList) {
		this.mutableList = mutableList;
	}

		public void getSize(List<Integer> mutableList){
		System.out.println(mutableList.size());
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public void  getIndex(List<Integer> mutableList){
		System.out.println(mutableList.get(this.index));
	}

	public void setNewValue(List<Integer> mutableList, int newValue) {
		this.newValue = newValue;
		mutableList.set(this.index, this.newValue);
		System.out.println(mutableList);
	}

	public void addNewValue(List<Integer> mutableList){
		mutableList.add(this.newValue);
		System.out.println(mutableList);
	}
	public void removeValue(List<Integer> mutableList){
		mutableList.remove(this.index);
		System.out.println(mutableList);
	}



}
