package main;

public class Hash<T> {
	public Linked[] list;
	public int listSize;
	
	public Hash(int listSize) {
		this.list = new Linked[listSize];
		this.listSize = listSize;
	}
	
	public void insertValues(int value) {
		int position = this.getValuePosition(value);
		if(position == 0) {
			this.list[position].insertValue(value);
		} else {
			for(int i = position; i < this.listSize; i++) {
				for(int j = 0; j < this.list[i].listSize; j++) {
					if(this.list[i].getValue(j) == 0) {
						this.list[i].insertValue(value);
						return;
					}
				}
				
			}
			System.out.println("Nao foi possivel inserir o valor " + value);
		}
	}
	
	private int getValuePosition(int value) {
		return value % this.listSize;
	}
	
	public void showList() {
		for(int i = 0; i < this.listSize; i++) {
			System.out.print("[" + i + "]");
			this.list[i].show();
			System.out.println();
		}
		System.out.println();
	}
}
