
package my;

public class MyBean{

	public String name;
	public String college;

	public void setName(String name){
		this.name=name;
		}

	public String getName(){
		return name;
		}

	public void setCollege(String college){
		this.college=college;
		}

	public String getCollege(){
		return college;
		}

	public String validate(){
		if(name.equals("Anubhav")&&college.equals("ABESEC"))
				return "True";
		
			else
			return "False";

			}

	public int add(int a,int b)
		{
		return a+b;
		}




			}