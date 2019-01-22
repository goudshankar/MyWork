package com.shs.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public class TestThreadPool {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExecutorService executorService=Executors.newFixedThreadPool(2);
		for(int i=0;i<4;i++) {
			Runnable worker=new WorkerThread("Hello:"+i);
			executorService.execute(worker);
		}
			executorService.shutdown();
			while(!executorService.isTerminated()) {}
				System.out.println("Finished all threads");
			
		}
	}



