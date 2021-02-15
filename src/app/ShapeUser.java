package app;

public class ShapeUser extends Circle {
	public static void main(String[] args) {
		Shape[] shape = new Shape[3];
		shape[0] = new Circle(5);
		shape[1] = new Circle(7);
		shape[2] = new Rect(9, 5);
		System.out.println("넓이");
		System.out.println("shape[0]'s area : " + shape[0].area());
		System.out.println("shape[1]'s area : " + shape[1].area());
		System.out.println("shape[2]'s area : " + shape[2].area());
		//문제 1) circumference 둘레 구하기
		//문제 2) shape[i] 도형의 반지름 3 값으로 변경해서 결과를 출력하시오
		System.out.println("-------------------------------------------------");
		System.out.println("둘레");
		System.out.println("shape[0]'s area : " + shape[0].circumference());
		System.out.println("shape[1]'s area : " + shape[1].circumference());
		System.out.println("shape[2]'s area : " + shape[2].circumference());
		
			Circle c = (Circle)shape[1];
            c.setRadius(3);	
            System.out.println("2번 문제 답 ");
            System.out.println("shape[1] : " + c.area());
            System.out.println("shpe[1] : " + c.circumference());
		  
		 
	 
}
}