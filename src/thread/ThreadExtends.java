package thread;
class ExtendingThread extends Thread
{
	public void run() {
		System.out.println("Extending the thread class, thread started running");
	}
}
public class ThreadExtends {
	public static void main(String[] args) {
		ExtendingThread t1= new ExtendingThread();
		t1.start();

	}
}
