package app;

import java.io.IOException;

/*
 * ���
   - ��Ʈ�� : �Ϲ������� ����Ÿ, ��Ŷ ���� �Ϸ��� ���Ӽ��� ���� �帧�� �ǹ��Ѵ�.(�帣�� ������~�����帧)
   - �� ����� ��Ʈ�� : �����͸� �а� ���� ������ ���α׷��� ������ �𵨸� �� ���� ��
   - ���� : �����͸� �ӽ������� ��Ƶδ� ����
   
 * �ڹ��� ����� ��Ʈ�� ����
   - �� �������� �帧
   - ���۸� ���� �� �ִ�
   - FIFO(First In First Out)�� ����    (first in first out system)
   - ����(Charactor Stream), ����Ʈ ( byte Strea)�� �з� ��
   
  * ����(Charactor Stream) ���� �ֻ��� ��Ʈ��
   - Reader class
           �Է� ��Ʈ�� : ���� �����͸� �о� ���̴� ��Ʈ��
   - Writer class
           ��� ��Ʈ�� : ���� �����͸� ����ϱ� ���� ��Ʈ�� 
           
  * ����Ʈ(byte Stream) ����Ʈ �ֻ��� ��Ʈ��
   - InputStream class
           �Է� ��Ʈ�� : ����Ʈ �����͸� �о� ���̴� ��Ʈ��
             (�Է� �ֻ��� ��Ʈ��)
   - OutputStram class
           ��� ��Ʈ�� : ����Ʈ �����͸� ����ϱ� ���� ��Ʈ��
             (��� �ֻ��� ��Ʈ��)
   ex) static PrintStream out(The "standard" output stream.)

 */
//    System.out.println   System class �� outputstream ���ͷ� println ��ü�� �θ���
public class IOEx {
	public static void main(String[] args) {
		System.out.print("�Է� : ");
		char c = ' ';
		try {
			c = (char)System.in.read();
		}catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("��� : " + c);
	}

}
