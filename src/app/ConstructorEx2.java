package app;
// this. �� ��ġ�� ��������� this() �� ���� �� �ֻ����� �;���
public class ConstructorEx2 {
	/*int var;
	ConstructorEx2(){    // �� ������ �־�� �Ʒ� 17���� 12������ �ڵ������� ���밡��
		             
		this(10);
	System.out.println("������ ���๮" + this.var);   // this ��  ����� �ǹ��Ѵ� 4���� �տ� int var
	
	}
	ConstructorEx2(int a){
		System.out.println("������ ���๮2");
		
	}
	public static void main(String[] args) {
		
		new ConstructorEx2();          // 5�� ���� ����ٸ�   int a �� ���� ����������� ex) new ContructorEx2(10)
	}*/
	
	int var;
	ConstructorEx2(){       //35���� ���� ���⼭ ����
            this(10);       // this ���� �ҷ��༭ 25������
	        System.out.println("������ ���๮1");   
	}
	ConstructorEx2(int a){ 
		    this(10, "A");  //�ٽ� this ���� �ҷ��༭ 29������
		    System.out.println("������ ���๮2" + a);
	}
	ConstructorEx2(int a,String s){	    // �� �̻� this 
	        System.out.println("������ ���๮3");
		
	}
	public static void main(String[] args) {
		
		new ConstructorEx2();   //������ �ҷ��� ������      
}
}
	
