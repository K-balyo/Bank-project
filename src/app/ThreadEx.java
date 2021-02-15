package app;

/*
      1. ���
      ���μ���(Process) - �������� ���α׷�
      ��Ƽ �½�ŷ(Multi Tasking) - ���μ����� ���ÿ� ���� �� ó���ϴ� ��
      ������(Thread) - ���� ������(thread of executiong)�� ��Ī�ϸ�,
                                   �����Կ� �־� ������ �� �ٸ� ����(thread)�� �ǹ�,
                                   �̷� ���� �����尡 ���� ���� �۵��� ��츦 ��Ƽ�������̶� �մϴ�.
                                   
      2. ������ ����ϱ� 
        
         1 - java.lang.thread Ŭ���� ���
            - Thread Ŭ������ ��ӹ��� �� �ش� �����忡�� �����ϰ� ���� �ڵ带 run() �޼ҵ�� �������̵� �մϴ�.
            - �ش� Ŭ���� �ν��Ͻ��� ������ �� Ŭ���� ��ü�� start() �޼ҵ带 ȣ���մϴ�.
            
             ex) 
             public class FirstThread extends Thread{
             public void run(){
               while(true){
                  System.out.println("������ �׽�Ʈ...");
                  }
               }
               public static void main(String[] args){
               FirstThread thread = new FirstThread();
               thread.start();
                    }
               }
       
       3. ������ ����ϱ� 
         
         2 - Runnable �������̽� ���
           - Runnable �������̽��� ������ Ŭ������ �����ϰ� �����ϰ� ���� �ڵ带 run() �޼ҵ忡�� �������̵� �մϴ�.
           - Ŭ���� ��ü�� Thread Ŭ���� �������� �Ű������� �Ѱܼ� 
                          ���ο� ������ ��ü�� ����� �� ��ü���� start() �޼ҵ带 ȣ���մϴ�.
                          
    public class SecondThread implements Runnable{
    public void run(){
        while(true){
           System.out.println("������ �׽�Ʈ ...");
           }
     }
     
     public static void main(String args[]){
     SecondThread st = new SecondThread();
     Thread thread = new Thread(st);
     thread.start();
         }
     }
      
      
      
      
 */

public class ThreadEx  extends Thread{
	public void run() {
		while(true) {
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {	
				e.printStackTrace();
			}
			System.out.println("������ �׽�Ʈ...");
		}
	}
	
	public static void main(String[] args) {
		ThreadEx thread = new ThreadEx();
		thread.start();
		System.out.println("main ����");
	}
	
}
