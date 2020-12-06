class Sample 
{Test get()
{int x;
Test t=new Test()
{public void show()
{ System.out.println("Show in Nested class");
}};
return t;
}}
 interface Test
{
void show();
}
