
public class Emp
{
	private String name;
	private Salary salary;

	public Emp(Salary salary)
		{
		System.out.println("Contructor in Emp");
		this.salary=salary;
		}

	public void setName(String name)
		{
		this.name=name;
		}

	public void getName()
		{
		System.out.println("name is :"+name);
		}
		
	public void showSalary()
		{
		System.out.println("basic is:");salary.getBasic();
		System.out.println("Ta is:");salary.getTa();
		System.out.println("Da is:");salary.getDa();
		}
}