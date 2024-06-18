package Exceptionhandling;

public class Color {

private String colorName;

// Setter method for colorName
public void setColorName(String colorName) throws ColorException {
   if (colorName.equalsIgnoreCase("red") || colorName.equalsIgnoreCase("green") || colorName.equalsIgnoreCase("white")) {
       this.colorName = colorName;
   } else {
       throw new ColorException("Invalid color name. Only 'red', 'green', or 'white' allowed.");
   }
}

// Getter method for colorName
public String getColorName() {
   return colorName;
}

// ToString method to represent the object as a string
@Override
public String toString() {
   return "Color: " + colorName;
}
}