package app;
//쓰레드에서는 sleep 사용을 권장한다   

public class ThreadA extends Thread{
	@Override
	public void run() {
		while(true){
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("ThreadA");
	}

}
}