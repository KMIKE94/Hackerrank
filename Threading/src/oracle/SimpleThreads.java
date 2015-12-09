package oracle;

public class SimpleThreads {
	//Display a message, preceded by
	//the name of the current thread
	static void threadMessage(String message){
		String threadName = Thread.currentThread().getName();
		
		System.out.format("%s: %s%n", threadName, message);
	}
	
	private static class Messageloop implements Runnable{
		public void run(){
			String importInfo[] = {
					"Mares eat oats",
					"Does eat oats",
					"little lambs eat ivy",
					"A kid will eat ivy too"
			};
			try{
				for(int i = 0; i < importInfo.length; i++){
					//Pause for 4 seconds
					Thread.sleep(4000);
					//Print a message
					threadMessage(importInfo[i]);
				}
			}catch(InterruptedException e){
				threadMessage("I wasn't done!");
			}
		}
	}
	
	public static void main(String args[]) throws InterruptedException{
		//Delay, in millieseconds before
		//we interrupt
		//thread(default one hour)
		long patience = 1000 * 60 * 60;
		
		//If command line argument present,
		//gives patience in seconds
		if(args.length > 0){
			try{
				patience = Long.parseLong(args[0]) * 1000;
			}catch(NumberFormatException e){
				System.err.println("Argument must be an integer.");
				System.exit(1);
			}
		}

		threadMessage("Starting MessageLoop thread");
		long startTime = System.currentTimeMillis();
		Thread t = new Thread(new Messageloop());
		t.start();
		
		threadMessage("Starting MessageLoop thread");
		//loop until MessageLoop
		//thread exits
		while(t.isAlive()){
			threadMessage("Still waiting...");
			//wait maximum of 1 second
			//for Messageloop thread
			//to finish
			t.join(1000);
			if(((System.currentTimeMillis() - startTime) > patience) && t.isAlive()){
				threadMessage("Tired of waiting!");
				t.interrupt();
				//Shouldn't be long now
				// -- wait indefinitely
				t.join();
			}
		}
		
		threadMessage("Finally!");
	}
}
