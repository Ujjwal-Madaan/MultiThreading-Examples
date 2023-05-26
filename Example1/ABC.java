package Example1;

// ABC class implements the interface Runnable
public class ABC implements Runnable {
	public void run() {
		try
		{
			System.out.println("ThreadState1.t1.getState() 1 - " + ThreadState1.t1.getState());
			Thread.sleep(100);
			System.out.println("ThreadState1.t1.getState() 2 - " + ThreadState1.t1.getState());
		} catch (InterruptedException ie) {
			ie.printStackTrace();
		}

		System.out.println("The state of thread t1 in ABC while on thread t2 -" + ThreadState1.t1.getState());
		System.out.println("The state of thread t1 in ABC while on thread t2 -" + Thread.currentThread().getName());

		try
		{
			Thread.sleep(200);
		} catch (InterruptedException ie) {
			ie.printStackTrace();
		}

		System.out.println("The state of thread t2 while t1 is in waiting state");

	}
}
