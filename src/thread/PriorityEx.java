package thread;

public class PriorityEx extends Thread
{
	public void run()
	{
		System.out.println("Priority of Thread is:"+Thread.currentThread().getPriority());
	}
	public static void main(String[] args) {
		PriorityEx t1= new PriorityEx();
		t1.setPriority(Thread.MAX_PRIORITY);
		t1.start();
	}

}
