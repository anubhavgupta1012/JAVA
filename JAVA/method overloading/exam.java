class Test
{int y;
void m1(int x)
{System.out.println("first m1");

}
}
class exam extends Test
{
 void m1(float ft)
{System.out.println("second m1");
}
public static void main(String []s)
{exam t= new exam();
t.m1(55);
}}