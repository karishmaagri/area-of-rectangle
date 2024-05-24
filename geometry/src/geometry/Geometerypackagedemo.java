package geometry;
import geometry.Circle;
import geometry.Rectangle;
import geometry.Triangle;


public class Geometerypackagedemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Circle circle = new Circle(5);
		Rectangle rectangle = new Rectangle(4,6);
		Triangle triangle = new Triangle(3,4,8);
		
		
		System.out.println("Circle");
		System.out.println("Area: " + circle.calculateArea());
		System.out.println("Perimeter: " + circle.calculatePerimeter());


		System.out.println("Recatngle");
		System.out.println("Area: " + rectangle.calculateArea());
		System.out.println("Perimeter: " + rectangle.calculatePerimeter());
		

		System.out.println("Triangle");
		System.out.println("Area: " + triangle.calculateArea());
		System.out.println("Perimeter: " + triangle.calculatePerimeter());


	}

}
