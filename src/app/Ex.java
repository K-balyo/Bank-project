package app;
/*
 *  ��������(constraint)
               ��������(constraint)�̶� �������� ���Ἲ�� ��Ű�� ����, �����͸� �Է¹��� �� 
               ����Ǵ� �˻� ��Ģ�� �ǹ��մϴ�.
               �̷��� ���� ������ CREATE ������ ���̺��� ������ ���� ALTER ������ �ʵ带 
               �߰��� ���� ������ ���� �ֽ��ϴ�.
               -MySQL���� ����� �� �ִ� ���� ������ ������ �����ϴ�.
               1. NOT NULL
               2. UNIQUE
               3. PRIMARY KEY
               4. FOREIGN KEY
               5. DEFAULT
              
          - NOT NULL
          
           NOT NULL ���� ������ �����ϸ�, �ش� �ʵ�� NULL ���� ������ �� �����ϴ�.
           ��, �� ���� ������ ������ �ʵ�� ������ �����͸� ������ �־�� �մϴ�.
           NOT NULL ���� ������ CREATE������ ���̺��� ������ ����,
           ���߿� ALTER ������ �߰��� ���� �ֽ��ϴ�.
           
           ex1) [���̺� ����]
           CREATE TABLE TEST1(
           ID VARCHAR(10) NOT NULL,
           PW VARCHAR(30),
           NAME VARCHAR(30),
           MDate DATE,   ��¥ ������ �����Ҷ� ���� �ڵ�
           AGE INT(3)
           );
   
 */
// ex1) ���̺� ����
public class Ex {

}
