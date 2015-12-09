package oracle;

public class SleepMessages {
	public static void main(String args[]) throws InterruptedException{
		String importInfo[] = {
				"Mares eat oats",
				"Does eat oats",
				"little lambs eat ivy",
				"A kid will eat ivy too"
		};
		
		for(int i = 0; i < importInfo.length; i++){
			//Pause for 4 seconds
			Thread.sleep(4000);
			//Print a message
			System.out.println(importInfo[i]);
		}
	}
}
