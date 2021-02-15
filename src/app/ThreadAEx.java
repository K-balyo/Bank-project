package app;

public class ThreadAEx {

	public static void main(String[] args) {
		ThreadA threadA = new ThreadA();
		threadA.start();
		for(int i = 0; i < 1000; i++) {
			System.out.println("Main Thread");
		}
	}
}
