package firstproject;

public class Rectangle {
	
	    protected double length;
	    protected double breadth;
	    
	    // Constructor
	    public Rectangle(double length, double breadth) {
	        this.length = length;
	        this.breadth = breadth;
	    }
	    
	    // Method to calculate area
	    public double calculateArea() {
	        return length * breadth;
	    }
	    
	    // Method to calculate perimeter
	    public double calculatePerimeter() {
	        return 2 * (length + breadth);
	    }
	}

	
	