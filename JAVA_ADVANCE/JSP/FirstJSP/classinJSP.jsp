<html>

	<body>
	<%!
	javax.servlet.jsp.JspWriter localOut;


	class Base{
		public void start()throws java.io.IOException{
		localOut.println("Starting...<br>");
							}
		}

	class Derived extends Base{
		public void fly()throws java.io.IOException
			{
			localOut.println("flying...<br>");
			}
				}

	class Derived2 extends Derived{
		public void fly()throws java.io.IOException
			{
			localOut.println("flying2...<br>");
			}
				}
	%>

	<%
	localOut=out;
	out.println("Creating A Derived Class Object...<br>");
	Base b=new Derived2();
	b.start();
	//b.fly();
	Derived2 b2=new Derived2();
	b2.fly();
	//b2.start();

	%>
	</body>

</html>