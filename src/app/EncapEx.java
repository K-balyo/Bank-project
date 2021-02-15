package app;
/*
 ���� ������(Access modifiers)
   - ��ü�� ����� �����ϱ� ���� ������
   ���� )
   - private, default(friendly).protected,public    ���ȼ� ���� ���� ���ʿ��� ���������� �� ���� ���ٱ����� Ŀ�� �� �������� ��� ���Ӱ��� ���� ���� ����
  ���� )
  - Ŭ����ǥ��
  [����������] class Ŭ������
  
  - �޼��� ǥ��
  [����������][�ڷ���] �޼����(���ڵ�){}
 
  - ���� ǥ��
  [����������][�ڷ���] ������ = ������;
  
  - ������ ǥ��
  [����������] Ŭ������(���ڵ�){}
    
    
  
    */
public class EncapEx {
	public static void main(String[] args) {
		Encap encap = new Encap();
		System.out.println(encap.a);
		System.out.println(encap.b);
		System.out.println(encap.c);
		encap.setD(50);
		System.out.println(encap.getD());
	}

}
  class Encap{
	  public int a = 10;
	  protected int b = 20;
	  int c = 30;
	  private int d = 40;             
	  Encap(){
		  System.out.println(d);
	  }
	  public void setD(int d) {           //�Ʒ� int�� ��Ʈ 
		  this.d = d;
	  }
	  public int getD() {
		  return this.d;
	  }
  }
