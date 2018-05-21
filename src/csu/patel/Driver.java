package csu.patel;

public class Driver {

	public static void main(String[] args) {

		Circle c1 = new Circle();
		System.out.println("c1 " + c1);
		
		Circle c2 = new Circle(1, "Red", true);
		System.out.println("c2 " + c2);

		Rectangle r1 = new Rectangle();
		System.out.println("r1 " + r1);

		Rectangle r2 = new Rectangle(11, 22, "Blue", false);
		System.out.println("r2 " + r2);
		System.out.println("r2 area= " + r2.getArea());
		System.out.println("r2 perimeter= " + r2.getPerimeter());

	}

}
