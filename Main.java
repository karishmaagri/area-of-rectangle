package firstproject;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Creating a rectangle
        Rectangle rectangle = new Rectangle(5, 4);
        System.out.println("Rectangle:");
        System.out.println("Area: " + rectangle.calculateArea());
        System.out.println("Perimeter: " + rectangle.calculatePerimeter());
        
        // Creating a square
        Square square = new Square(6);
        System.out.println("\nSquare:");
        System.out.println("Area: " + square.calculateArea());
        System.out.println("Perimeter: " + square.calculatePerimeter());
    }
}


	