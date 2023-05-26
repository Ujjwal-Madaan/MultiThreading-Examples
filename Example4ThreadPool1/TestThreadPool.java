package Example4ThreadPool1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestThreadPool {
	public static void main(String[] args) {
		ExecutorService executor = Executors.newFixedThreadPool(5);//creating a pool of 5 threads
		for (int i = 0; i < 10; i++) {
			Runnable worker = new WorkerThread("" + i);
			executor.execute(worker);//calling execute method of ExecutorService
			System.out.println("Sent the task " + i);
		}
		executor.shutdown();
		while (!executor.isTerminated()) {   }

		System.out.println("Finished all threads");
	}
}

//When executor.execute(worker) is called, the executor service takes the worker object and assigns it to an available thread from the thread pool. The thread will then execute the run() method of the WorkerThread class.