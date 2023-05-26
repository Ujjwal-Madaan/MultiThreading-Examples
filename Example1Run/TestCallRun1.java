package Example1Run;

class TestCallRun1 extends Thread{
	public void run(){
		for(int i=1;i<5;i++)
		{
			try{
				System.out.println("Name of the thread is - " + Thread.currentThread().getName());
				Thread.sleep(500);
			}
			catch(InterruptedException e){
				System.out.println(e);
			}
			System.out.println(i);
		}
	}
	public static void main(String args[]){
		TestCallRun1 t1=new TestCallRun1();
		TestCallRun1 t2=new TestCallRun1();

		t1.run();
		t2.run();
	}
}
