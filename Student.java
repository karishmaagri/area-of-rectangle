package employee;

public class Student {
	private String name;
	public Student() {
		this.name = "Unknown";
		
	}
	
	public Student(String name)
	{
		this.name = name;
	}

	public String getName()
	{
		return name;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student s1 = new Student();
System.out.println("Student 1: "  + s1.getName());
Student s2 = new Student("Karishma");
System.out.println("Student 2: " + s2.getName());
	}

}
