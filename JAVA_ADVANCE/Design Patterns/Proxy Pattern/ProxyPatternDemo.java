class ProxyPatternDemo{

		public static void main(String S[])
			{
			Image i=new ProxyImage("sql.png");
				i.display();
				System.out.println();
				i.display();
			}
	}