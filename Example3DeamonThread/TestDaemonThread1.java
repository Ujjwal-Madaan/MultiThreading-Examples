package Example3DeamonThread;

public class TestDaemonThread1 extends Thread{
	public void run(){
		if(Thread.currentThread().isDaemon()){//checking for daemon thread
			System.out.println("daemon thread work");
		}
		else{
			System.out.println("user thread work");
		}
	}
	public static void main(String[] args){
		TestDaemonThread1 t1=new TestDaemonThread1();//creating thread
		TestDaemonThread1 t2=new TestDaemonThread1();
		TestDaemonThread1 t3=new TestDaemonThread1();

		t1.setDaemon(true);//now t1 is daemon thread

		System.out.println("Starting t1 with priority - " + t1.getPriority());
		t1.start();//starting threads

		System.out.println("Starting t2 with priority - " + t2.getPriority());
		t2.start();

		System.out.println("Starting t3 with priority - " + t3.getPriority());
		t3.start();
	}
}
