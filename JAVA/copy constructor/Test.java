class Test
{ int x,y;
Test(int x,int y)
{this.x=x;
this.y=y;
System.out.println("First Constructor");
}
Test(Test t)
{ this.x=t.x;
this.y=t.y;
System.out.println("Second constructor");}
void show()

{System.out.println("x=:" +x);
System.out.println("y=:" +y);
}}

