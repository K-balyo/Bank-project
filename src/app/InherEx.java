package app;

/*
  ��� (inheritance)
  ����̶� �ڽ��� �θ� ������ �ִ� ����̳� �Ƿ��� �����޴´ٴ� �ǹ�/
  - Ư�� (�ڽ�) Ŭ������ �ٸ�(�θ�)Ŭ������ ������ �ִ� ��� ��� ������ ��� �޼ҵ带 ����� �� ����
  - ��� ���迡�� �ڽ� Ŭ������ ��ü�� �����Ͽ����� �θ� Ŭ������ ��ü�� �����Ǿ� ��.
  - ��� ���� ǥ������ extends, keyword�� �����.
  - ��� ���� ���� super, ����, �θ�, class�� sub, ����, �ڽ�class�� �����.
  - ����� ���信�� super �� this �� ������.  supeer �� �θ� this(����ó��) �� ����
  - �޼��带 ���� �� ������(method override).
  - ���� ���(�ڹٿ����� ���� ��� X).
  - extends �� implements �� �Բ� ����� �� ����.
  
  ����)
  class A extends B{
  ���� ����;
  }
 */
public class InherEx extends SuperClass{
	int c = 20;
	public InherEx() {
		super();
		System.out.println("B");
		
	}
	public static void main(String[] args) {
	new InherEx();
	
	}
}
class SuperClass{
	public SuperClass() {
		System.out.println("A");
	}
	int a = 10;
	String b = "A";
}