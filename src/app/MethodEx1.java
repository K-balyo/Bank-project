package app;

//�޼ҵ�(Method)
    /*
        - [���� ������] [������][��ȯ��] �޼ҵ� �� (���ڵ�){
                               ���� ����(����);
                               }
     *���� ������(Modifiers)
     *  : private, default(friendly),
     *         protected, public
     * ������ : static, final, abstract, native ...
     * ��ȯ��(return type) :
     *  - �ڹ� ������ �ڷ��� ( �⺻��, ������)
     *        ���� ����� �� ����.
         - void : ��ȯ���� ���� �޼ҵ� ���ǽ� ���.
     * �޼ҵ�� : �ĺ��ڷ� ������ �̸� ����.
     * ����(Arguments) : �Ű� ������� �ϸ�
                           �޼ҵ� ȣ��� �����͸� ���� �ϱ� ���� �뵵�� �����
         ǥ��  - 1)
     public int intA(){
                           ����;
                return n ; // n - > int �⺻ �ڷ����� �´� ������ ��ȯ
                }
                ǥ�� -2 )
                public void intB(int a, ...){
                ����;
                // return ������ ������� ����.
     */
public class MethodEx1 {
	
	public static int intA() {
		return 10;
	}
	public static void intB(int a) {
	}
	
	public static void main(String[] args) {
		int result = intA();
		System.out.println("��� : " + result);
	}

}
