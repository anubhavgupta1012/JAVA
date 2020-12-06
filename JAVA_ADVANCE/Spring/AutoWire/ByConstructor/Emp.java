
public class Emp
{
	private Salary salary;
	private String name;
	
		Emp(Salary s,String name)	
		{
		this.name=name;
		this.salary=s;
		}

	public void getName()
		{
		System.out.println("\n\n\nName is" +name);
		}

	public void showSalary()
		{
		System.out.println("basic is:");salary.getBasic();
		System.out.println("Ta is:");salary.getTa();
		System.out.println("Da is:");salary.getDa();
		}
}