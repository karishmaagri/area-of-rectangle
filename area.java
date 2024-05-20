package employee;

public class area {
private double length,breadth;

public void setDim(double length, double breadth)
{
	this.length = length;
	this.breadth = breadth;
}

public double getarea()
{
	return length*breadth;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
area a1 = new area();
a1.setDim(5, 5);
System.out.println("Area of Rectangle:" + a1.getarea());
	}

}
