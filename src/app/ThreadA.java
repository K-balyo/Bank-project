package app;
//�����忡���� sleep ����� �����Ѵ�   

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