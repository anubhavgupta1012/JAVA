
public class Emp
{
	private int salary;
	private String name;

	public Emp(int salary, String name)
		{
		this.salary=salary;
		this.name=name;
		}
	
	
	public void getSalary()
		{
		System.out.println("Salary is :"+salary);
		}
		
	
	public void getName()
		{
		System.out.println("name is :"+name);
		}
}