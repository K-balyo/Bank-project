package app;

public class ThreadEx2 {

	public static void main(String[] args) {
		Task task = new Task();  // 1
		Thread thread = new Thread(task); // 2
		thread.start();
		ThreadA thread2 = new ThreadA();  // 3
		thread2.start();
	}      // 실행시 3개의 쓰레드를 실행시킨다
}
