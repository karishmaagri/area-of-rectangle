package employee;

public class Myclass {
	int value;
	public Myclass() {
		value = 0;
		System.out.println("Default Constructor" + value);
	}
	
	public Myclass(int value) {
		this.value = value;
		System.out.println("parameterized constructor" + value);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Myclass obj1 = new Myclass();
       Myclass obj2 = new Myclass(50);
	}

}
