package thread;
class Thread1 extends Thread
{
	public void run() {
		for(int i=1; i<=5; i++) {
		System.out.println("The thread1 count will be:" +i);
	}
}
}
class Thread2 extends Thread
{
	public void run() {
		for(int j=6; j<=10; j++) {
		System.out.println("The thread2 count will be:" +j);
	}
}
}
public class Threadmain {
	public static void main(String[] args) {
		Thread1 t1= new Thread1();
		t1.start();
		
		Thread t2= new Thread2();
		t2.start();
	}

}
