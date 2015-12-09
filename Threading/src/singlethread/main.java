package singlethread;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class main {
	static int processors = Runtime.getRuntime().availableProcessors();
	@SuppressWarnings("null")
	public static void main(String args[]){
		ExecutorService executorService = Executors.newFixedThreadPool(processors);
		long system = System.currentTimeMillis();
		Thread[] threads = new Thread[30];
		for(int i = 0; i < threads.length; i++){
			threads[i] = newThread(i);
		}
		
		CountDownLatch latch = new CountDownLatch(threads.length);
		
		for(Thread thread : threads){
			executorService.execute(thread);
		}
		
		System.out.println("Here");
		
		try{
			latch.await();
		}catch(InterruptedException e){
			e.printStackTrace();
		}finally{
			
			
			System.out.println(String.valueOf(System.currentTimeMillis() - system));
		}
		
		
	}
	
	static Thread newThread(final int threadCount){
		Runnable r = new Runnable(){
			@Override 
			public void run(){
				if(threadCount > 5 && threadCount < 10){
					System.out.println("executing Thread Hello -" + threadCount);
				}else if(threadCount >= 10 && threadCount < 15){
					try {
						Thread.sleep(4000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println("executing Thread Hello -" + threadCount);
				}else if(threadCount >= 15){
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println("executing Thread Hello -" + threadCount);
				}
				
			}
		};
		return new Thread(r);
	}
}
