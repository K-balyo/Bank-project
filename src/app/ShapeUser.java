package app;

public class ShapeUser extends Circle {
	public static void main(String[] args) {
		Shape[] shape = new Shape[3];
		shape[0] = new Circle(5);
		shape[1] = new Circle(7);
		shape[2] = new Rect(9, 5);
		System.out.println("����");
		System.out.println("shape[0]'s area : " + shape[0].area());
		System.out.println("shape[1]'s area : " + shape[1].area());
		System.out.println("shape[2]'s area : " + shape[2].area());
		//���� 1) circumference �ѷ� ���ϱ�
		//���� 2) shape[i] ������ ������ 3 ������ �����ؼ� ����� ����Ͻÿ�
		System.out.println("-------------------------------------------------");
		System.out.println("�ѷ�");
		System.out.println("shape[0]'s area : " + shape[0].circumference());
		System.out.println("shape[1]'s area : " + shape[1].circumference());
		System.out.println("shape[2]'s area : " + shape[2].circumference());
		
			Circle c = (Circle)shape[1];
            c.setRadius(3);	
            System.out.println("2�� ���� �� ");
            System.out.println("shape[1] : " + c.area());
            System.out.println("shpe[1] : " + c.circumference());
		  
		 
	 
}
}