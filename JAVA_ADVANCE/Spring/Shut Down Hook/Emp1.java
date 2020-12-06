
public class Emp1{
	private String name1;

		Emp1()
		{
	System.out.println("\n\nDefault constructor in EMP1 Class");	
		}

	public void setName1(String name)
		{
		this.name1=name;
		}

	public void getName1()
		{
		System.out.println("My Name is :" +name1);
		}
	
	public void init()
		{
		System.out.println("Init Method in EMP1");
		}
	
	public void destroy()
		{
		System.out.println("Destroy Method in EMP1");
		}
	}