package thread;

class A extends Thread{
	@Override
	public void run() {
		for(int i=0;i<=10;i=2) {
			System.out.println("Even number");
		}
	}
}


class B extends Thread{
	@Override
	public void run() {
		for(int i=0;i<=10;i=1) {
			System.out.println("Odd number");
		}
	}
	
}

public class ThreadExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A thread1 = new A();
		B thread2 = new B();
		
		thread1.start();
		thread2.start();
		
	}

}
