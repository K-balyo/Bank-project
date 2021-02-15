package db;

/*
 * // ���� ����  �� ���̵� user20 ��� user
	//String driver = "com.mysql.cj.jdbc.Driver";
	//url = jdbc:mysql://192.168.0.157:3306/user20?characterEncoding=UTF-8&serverTimezone=UTC";
			//username=user20
			//password=user
 * ������(Data)
   ������ ����̳� ���� ����ȭ�ǰ� ��ϵɸ��� ��ġ�� �ִٰ� �ǴܵǤѤ� 
   ���� ������ � �����̳� ��ǿ� ���� ��ü���� ����
   
 * DB(DataBase) - ü��ȭ�� �������� ����.
    - ü��ȭ�� �����ͷ� �ۼ��� ������ν� ���� ���� �ý��۵��� ���յ� �������� �����Ͽ� ��� �� �ִ� ���� �����͵��� ����.
    - ��� �� ������ ���� ���� �ý��۵��� ������ �� �ֵ��� ���� ����� � ����Ÿ�� ����
    (���յ� ������, ����� ������, � ������, ���� ������)
    
    < �н� ��ǥ >
    - �ڹٿ����� DB�� ����ϱ� (JDBC)
    - JDBC(Java Database Connetivity)�� �ڹٿ��� �����ͺ��̽��� ������ �� �ֵ��� �ϴ� �ڹ� API�̴�.
    (Java�� �� DB���� ���� �� ���� ���� ���α׷���)
    - JDBC�� �����ͺ��̽����� �ڷḦ �����ϰų� ������Ʈ�ϴ� ����� �����Ѵ�.
    - JDBC�� �����ͺ��̽� ���ǹ��� �����Ͽ� ������ �����ͺ��̽�
    (relational database)�� �����͸� �˻�, �����ϴ� ����� �����մϴ�
    - DB�� ������ java�� ȯ�濡 �°� �ڽ��� ȸ���� ��ǰ�� �´� ���� ����� ������ Ÿ������ �����Ѵ�.
    - �������̽� ��� ���α׷���
        ���� ��ü�� ����ϴ� ����� �ƴ϶� �������̽� ��� ��ü�� ����ϴ� ������� ���α׷����Ѵ�.
        - Query
         �����͸� ��ȸ�ϴ� �� ���Ǵ� ���� ���ڵ尡 ���� ������ ������ ������(select) ������ �̿� ���Ѵ�.
         -DML(Data Mainpulation Language)
         �����͸� ó���ϴ� �κ����� ���ڵ忡 ���ο� ���� �߰�(insert), ����(update), ����(delete) �ϴµ� ����ϴ� ����̴�.
         -DDL(Data Definition Language)
         �����͸� �����ϴµ� ���Ǵ� ���� ���̺��̳� ������ ����(create)�ϰų� ����(drop)�ϴ� �������̴�/
         -DCL(Data Control Language)
         �����͸� �����ϴµ� ���Ǵ� ���� DDL�� ������ �����ϰ� �� �� ���� �ο�(grant)���� ���⿡ ���Ѵ�.
                 -�⺻������ SQL�� ���� ����� �����Ѵ�.
         SELECT, INSERT, UPDATE, DELETE
 */
public class DBEx {
	public static void main(String[] args) {
//		String driver = "com.mysql.jdbc.Driver";//ver5.x
		String driver = "com.mysql.cj.jdbc.Driver";//ver8.x
		try {
			Class.forName(driver);
			System.out.println("�����ͺ��̽� ����̹� �ε� ����");
		}catch(Exception e){
//			e.printStackTrace();
			System.out.println("�����ͺ��̽� ����̹� �ε� ����");
		}
		
	}
	
}
