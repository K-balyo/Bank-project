package app;

public class ClassEx3 {
	public static void main(String[] args) {
		
		Computer computer = new Computer();
		
		System.out.println("cpu : " + computer.cpu);
		System.out.println("ram : " + computer.ram);
		System.out.println("name : " + computer.name);
		computer.display();
        
		Computer computer2 = new Computer("���̿���");
		
		System.out.println("cpu : " + computer2.cpu);
		System.out.println("ram : " + computer2.ram);
		System.out.println("name : " + computer2.name);
		computer.display();
       
		Computer computer3 = new Computer("�ְ�����", 3950, 32);
		
		System.out.println("cpu : " + computer3.cpu);
		System.out.println("ram : " + computer3.ram);
		System.out.println("name : " + computer3.name);
		computer.display();
		
	}

}
class Computer{
   int cpu;
   int ram;
   String name;
   public Computer() {
	   cpu = 3600;
	   ram = 8;
	   name = "������";
   }
   public Computer(String n) {
	   name = n;
	   ram = 16;
	   cpu = 3700;
   }
   public Computer(String n, int c, int r) {    // �̸��� �ӵ��� �־���� ������ 
	   name = n;
	   cpu = c;
	   ram = r;
   }
   public void display() {
	   System.out.println("���� : " + name + " , cpu : " 
               +  cpu + ", RAM : " + ram + "GB");
      }}
   
