package app;
/*
  ��Ÿ ������(������)
  ����)
  -class : ����� �ȵ�
  -method : ������ �ȵ�
  -variable : ���ȭ
  *static :
     - ��ü ���� ���� ��밡��(���� �޸𸮿� ����)
  *abstract :
   - class : �߻� Ŭ����
   - method : �߻� �޼ҵ�
   
   [������][����������] ...
 */

public class StaticEx {
   
	   public final int A = 10;
	   public static int b = 10;
	   public static void method() {
		   System.out.println("method");
	   }
   public static void main(String[] args) {
	StaticEx se = new StaticEx();
	System.out.println(se.A);
	System.out.println(StaticEx.b);
	StaticEx.method();
	
   }
   }
   

