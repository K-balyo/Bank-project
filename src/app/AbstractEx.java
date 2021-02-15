package app;

/*
 * �߻�(abstract)
 * ��ü�� ��ȣ���� class�� ǥ���ϱ�����
   Ư¡ 
     - class�� ���� �߻� class �� �ǹ�(ex : abstract class).
     - �Ϲ� �޼����� �߻� �޼��� ��� ���� ��
     - ��ü�� ���� �� �� ����.
     - ��� ���迡�� ������ ��
     - ���� �͸� Ŭ����(���� annoymous class)�� ��ü���� �� ���� ����
     - �߻� �޼���� �������� �ʴ´�
     -�߻� �޼���� ������(Override)�Ͽ� �����
     - ��ӽ� extend keyword �� �����
         ǥ��)
        abstract class A{
             int a;
             ex) abstract void setA();
                      void setB()();
                 }
         ���)
           class B extends A{
               super class�� �߻� �޼��� ������
               }
 */
public class AbstractEx extends Abs {
	@Override
    public void methodB() {
		System.out.println("�߻� �޼��� ������");
	}
        public static void main(String[] args) {
        	AbstractEx ae = new AbstractEx();
        	System.out.println(ae.a);
        	ae.methodA();
        	ae.methodB();
        	
    }
}
abstract class Abs{
	int a = 10;
	public void methodA() {
		System.out.println("�Ϲ����� �޼��� ����");
	}
	public abstract void methodB();
		
	
}
 
