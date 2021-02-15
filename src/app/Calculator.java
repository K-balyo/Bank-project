package app;

public class Calculator {
	private int memory;

	public int getMemory() {
		return memory;
	}

	public synchronized void setMemory(int memory) {
//		 set memory �� ���� ���� �ֱ⶧���� synchronized �ڵ带 �߰�����. '����ȭ 'ó��
		this.memory = memory;
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
		}
		System.out.println(Thread.currentThread().getName() + " : " + this.memory);
	}

}
