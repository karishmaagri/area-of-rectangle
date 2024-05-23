package employee;

public class employeedata {
private String name;
private String desgination;
private int basicsalary;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDesgination() {
	return desgination;
}
public void setDesgination(String desgination) {
	this.desgination = desgination;
}
public int getBasicsalary() {
	return basicsalary;
}
public void setBasicsalary(int basicsalary) {
	this.basicsalary = basicsalary;
}
@Override
public String toString() {
	return "employeedata [name=" + name + ", desgination=" + desgination + ", basicsalary=" + basicsalary + "]";
}

}
