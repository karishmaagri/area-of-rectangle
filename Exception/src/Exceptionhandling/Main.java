package Exceptionhandling;

public class Main {

public static void main(String[] args) {
	     Color color = new Color();
	     try {
	         color.setColorName("Red");
	         System.out.println(color);
	     } catch (ColorException e) {
	         System.out.println("Error: " + e.getMessage());
	     }

	     try {
	         color.setColorName("Blue");
	         System.out.println(color);
	     } catch (ColorException e) {
	         System.out.println("Error: " + e.getMessage());
	     }
	 }
	}
