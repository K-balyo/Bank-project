package app;
/*�������̽�(interface)
- ��ü�� ���� �� �� ����
- class���� ��ӽ� implements keyword�� ���
- ���� ����� ������
- interface���� ����� �߻� �޼��常�� ���� ��
- interface ���� ��ӽÿ��� extend�� �����
- �Ϲ����� �޼��带 ���� �� ����
- ��ӽ� interface�� �ִ� ��� �޼��带 �������Ͽ� ���
- interface�� ���ǵ� �޼��� �� �ϳ��� ������ ���� �ʴ´ٸ� abstract class�� ���� �� �� ����

ǥ��)
interface A{
     ���� : [final][static] -> �����Ǿ� ����.
     ex) int A = 10;
     �޼��� [public][abstract] -> �����Ǿ� ����.
     ex) void method();
}
 ���1) 
 abstract class B implements A{
 �߻� �޼��� ����...
 �Ϲ����� �޼��� ����...
 }
 ���2)
 class C implements A{
 �������̽��� �����ϴ� �޼��� ������...
 }
 ���3)
 class D extends C implements A{}
 class D extends C implements A, B, C ...{}

=> ���� ��� ����...
*/
interface InterfaceA{
	final static int A = 10; // final static �������� ������� ������ �ȳ���
	void methodA();
}
interface InterfaceB{
	int B = 20;
	String methodB();
}
abstract class AbstractC{
	void methodC() {
		System.out.println("methodC");
		
	}
}
public class InterfaceEx extends AbstractC implements InterfaceA, InterfaceB{  //���� �������̵��� ���� ������ InterfaceEx ���� ����������
               	@Override    
	            public void methodA() {
	               	System.out.println("methodA");
	    }
               	@Override
	            public String methodB() {
               		return "methodB";
               	}
                public static void main(String[] args) {
                	InterfaceEx obj = new InterfaceEx();
                	obj.methodA();
                	System.out.println(obj.methodB());
                	obj.methodC();
                	System.out.println(obj.A);
                	System.out.println(obj.B);
                	
                	InterfaceA pbj2 = obj;
                	
            	 
      }
   }
