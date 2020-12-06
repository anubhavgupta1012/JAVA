interface Test
{String sayHello(String str);
}


class  Demo1
{ public static void main(String S[])
{
System.out.println(new Test(){ public String sayHello(String str)
{return("WELCOME "+str);
}
}.sayHello("ABC"));


}

}