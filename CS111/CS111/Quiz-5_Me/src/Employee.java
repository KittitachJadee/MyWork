//Pangon La-or-on
//6409700074

public class Employee {
	private String name;
	private double salary;
	
	public Employee() {
		
	}
	public Employee(String name, double salary)
	{
		this.name=name;
		this.salary=salary;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setSalary(double salary) {
		this.salary=salary;
	}
	public String getName() {
		return name;
	}
	public double getSalary() {
		return salary;
	}
}