class Test
{int x,y;

init{System.out.println("FIrst init block");
x=10;
}
Test()
{System.out .println("this is the constructor:"+x);
}
{System.out.println("Second init block");
x=x+20;
}
public static void main(String s[])
{Test t=new Test();
}}