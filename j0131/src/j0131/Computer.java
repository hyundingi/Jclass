package j0131;

public class Computer extends Product {
	
	private int size;
	private int thick;
	private boolean ctype;
	
	// 기본생성자
	Computer(){
		// 다른 생성자를 호출하는 this
		this("GCOM",2000000,200000,17,3,true);
	}
	

	public Computer(String name, int price, int point, int size, int thick, boolean ctype) {
		setName(name);
		setPrice(price);
		setPrice(point);
		this.size = size;
		this.thick = thick;
		this.ctype = ctype;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getThick() {
		return thick;
	}

	public void setThick(int thick) {
		this.thick = thick;
	}

	public boolean getCtype() {
		return ctype;
	}

	public void setCtype(boolean ctype) {
		this.ctype = ctype;
	}
	
	
}
