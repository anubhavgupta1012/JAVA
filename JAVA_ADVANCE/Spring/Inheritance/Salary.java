public class Salary{
	private int id;
	private int basic;
	private int ta;
	private int da;
		
	public void setId(int id)
		{
		this.id=id;
		}
	
	public void setBasic(int basic)
		{
		this.basic=basic;
		}
		
	public void setTa(int ta)
		{
		this.ta=ta;
		}
		
	public void setDa(int da)		
		{
		this.da=da;
		}

	public void getId()
		{
		System.out.println("Your Id:"+id);
		}
		
	public void getTa()
		{
		System.out.println("Your Ta:"+ta);
		}
	public void getDa()
		{
		System.out.println("Your Da:"+da);
		}
	public void getBasic()
		{
		System.out.println("Your basic:"+basic);
		}
	
	}