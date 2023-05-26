package Example1;

// How to take thread to different state
// Creating the thread --- NEW
// Thread.start() --- RUNNABLE
// Thread.sleep(n) --- TIMED_WAITING



public class ThreadState1 extends Thread
{
	ThreadState1(String name) {
		super(name);
	}
	public static ThreadState1 t1;

	public static void main(String argvs[])
	{
		t1 = new ThreadState1("Th1");
		t1.setName("T1");

		System.out.println("The state of thread t1 after spawning it - " + t1.getState());

		t1.start();

		System.out.println("The state of thread t1 after invoking the method start() on it - " + t1.getState());
	}

	public void run()
	{
		System.out.println("Current thread name is " + Thread.currentThread().getName());
		System.out.println("The state of thread t1 after invoking the method run() on it - " + t1.getState());
		// RUNNABLE, NEW, BLOCKED, WAITING, TIMED_WAITING, TERMINATED

		ABC myObj = new ABC();
		Thread t2 = new Thread(myObj, "T2");

		System.out.println("The state of thread t1 after invoking the method run() on it - " + t1.getState());

		System.out.println("The state of thread t2 after spawning it - "+ t2.getState());
		t2.start();

		System.out.println("the state of thread t2 after calling the method start() on it - " + t2.getState());

		try
		{
			Thread.sleep(200);
			System.out.println("The state of t1 - " + t1.getState() + " and the state of t2 - " + t2.getState());
		}
		catch (InterruptedException ie)
		{
			ie.printStackTrace();
		}

		System.out.println("1. The state of thread t2 after invoking the method sleep() on it - "+ t2.getState() );

		try
		{
			System.out.println("The state of thread t1 first time - " + t1.getState());
			t2.join();
			System.out.println("The state of thread t1 second time - " + t1.getState());
		}
		catch (InterruptedException ie)
		{
			ie.printStackTrace();
		}
		System.out.println("The state of thread t2 when it has completed it's execution - " + t2.getState());
	}

}
