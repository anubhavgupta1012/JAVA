
public class Emp{
	private String name;

		Emp()
		{
	System.out.println("Default constructor in EMP Class");	
		}

	public void setName(String name)
			{
			this.name=name;
			}

	public void getName()
			{
			System.out.println("My Name is :" +name);
			}

		}