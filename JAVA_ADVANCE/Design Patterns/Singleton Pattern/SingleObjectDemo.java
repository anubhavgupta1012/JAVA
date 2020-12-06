class SingleObjectDemo{

	public static void main(String S[])
			{
				SingleObject s=SingleObject.getInstance();
					s.showMessage();
				SingleObject s1=SingleObject.getInstance();
						
				System.out.println(s==s1);
				
			}	


			}