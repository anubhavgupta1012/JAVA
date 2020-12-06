public class Salary{
	private int basic;
	private int ta;
	private int da;
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