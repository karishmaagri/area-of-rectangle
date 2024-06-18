package Exceptionhandling;



class Thread2 implements Runnable{
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("Hi");
		}
	}
}


public class ThreadExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	

Thread1 th1 = new Thread1();
th1.start();

Thread2 th2 = new Thread2();
Thread th = new Thread(th2);

th.start();
	}

}
