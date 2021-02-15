package app;

public class ThreadEx3 {
	public static void main(String[] args) {
		Thread thread = new Thread(new Runnable() {
			public void run() {
				while (true) {
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println("실행단위");
				}
			}
		});
		thread.start();
	}

}

