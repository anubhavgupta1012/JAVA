
public class Emp1
{
	private Salary salary,salary1;
	private String name;
	
		Emp1(Salary s,String name,Salary s12)	
		{
		this.name=name;
		this.salary=s;
		this.salary1=s12;
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