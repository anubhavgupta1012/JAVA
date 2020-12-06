class random1
{ int y;
static int x;
{System.out.println("Second init block");
x=x+20;}

static
{System.out.println("first init block");
x=10;}
static void set()
{System.out.println("i m fine");
}


random1()
{System.out.println("this is the constructor =" +x);}

public static void main(String S[])
{new random1();
random1.set();
}
}

