
public class Emp
{
	private Salary salary;

	public void setSalary(Salary salary)
		{
		this.salary=salary;
		}

	public void showSalary()
		{
		System.out.println("basic is:");salary.getBasic();
		System.out.println("Ta is:");salary.getTa();
		System.out.println("Da is:");salary.getDa();
		}
}