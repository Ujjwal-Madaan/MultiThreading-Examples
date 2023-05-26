package Example2JoinMethod.Join1;

public class ThreadJoin extends Thread{
	public void run()
	{
		for (int j = 0; j < 2; j++)
		{
			try
			{
				System.out.println(Thread.currentThread().getName() + " came in the run function!");
				Thread.sleep(300);
				System.out.println("The current thread name is: " + Thread.currentThread().getName());
			}
			// catch block for catching the raised exception
			catch(Exception e)
			{
				System.out.println("The exception has been caught: " + e);
			}
			System.out.println(j + " is printed by " + Thread.currentThread().getName() + "\n");
		}
	}
}
