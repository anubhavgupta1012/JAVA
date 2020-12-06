class Test
{int x,y;
{System.out.println("hey its me");}
Test(int val)
{System.out.println("obj created");
x=val;
}
void show()
{System.out.println("x is =" +x);
}

{System.out.println("hey its mw agaiin");
}}

class Demo
{public static void main(String []s)
{Test t1=new Test(5);
Test t2=new Test(6);
t1.show();
t2.show(); 
}
}