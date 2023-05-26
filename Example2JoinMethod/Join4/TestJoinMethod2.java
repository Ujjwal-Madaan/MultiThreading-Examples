package Example2JoinMethod.Join4;

class TestJoinMethod2 extends Thread{
	public void run(){
		for(int i=1;i<=5;i++){
			try{
				System.out.println("Gate keeping 1 for thread: " + Thread.currentThread().getName());
				Thread.sleep(500);
				System.out.println("Gate keeping 2 for thread: " + Thread.currentThread().getName());
			}catch(Exception e){
				System.out.println(e);
			}
			System.out.println(i + " is implemented by " + Thread.currentThread().getName());
		}
	}
	public static void main(String args[]){
		TestJoinMethod2 t1=new TestJoinMethod2();
		TestJoinMethod2 t2=new TestJoinMethod2();
		TestJoinMethod2 t3=new TestJoinMethod2();
		t1.start();
		try{
			t1.join(1500);
		}catch(Exception e){System.out.println(e);}

		t2.start();
		t3.start();
	}
}
