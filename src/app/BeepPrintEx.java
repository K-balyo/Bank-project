package app;

public class BeepPrintEx {

	public static void main(String[] args) {
		BeepTask beep = new BeepTask();
		Thread thread = new Thread(beep);
		thread.start();
		for(int i = 0; i < 5; i++) {
			System.out.println("гн");
			try {Thread.sleep(500);}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}
