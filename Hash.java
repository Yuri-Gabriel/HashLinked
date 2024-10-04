public class Hash {
	public Linked[] list;
	public int listSize;
	
	public Hash(int listSize) {
		this.list = new Linked[listSize];
		this.listSize = listSize;
		for(int i = 0; i < this.listSize; i++) {
			this.list[i] = new Linked();
		}
	}

	public boolean searchValue(int value) {
		for(Linked list : this.list) {
			if(list.valueHasInserted(value)) {
				return true;
			}
		}
		return false;
	}
	
	public void insertValues(int value) {
		int position = this.getValuePosition(value);
		this.list[position].insertValue(value);
	}

	public void deleteValue(int value) {
		int position = this.getValuePosition(value);
		this.list[position].deleteValue(value);
	}
	
	private int getValuePosition(int value) {
		if(value < 0) value *= -1;
		return value % this.listSize;
	}
	
	public void showList() {
		for(int i = 0; i < this.listSize; i++) {
			System.out.print("[" + i + "]: ");
			this.list[i].show();
			System.out.println();
		}
	}
}
