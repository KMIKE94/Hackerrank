package oracle;

public class HelloRunnable implements Runnable{
	public void run(){
		System.out.println("Hello from the Thread");
	}
	
	public static void main(String args[]){
		(new Thread(new HelloRunnable())).start();
		
		HelloThread helloThread = new HelloThread();
		
		helloThread.start();
	}
}

class HelloThread extends Thread{
	public void run(){
		System.out.println("Hello from SubClass thread");
	}
}
