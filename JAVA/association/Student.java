class Book
{int code, price;
Book(int code,int price)
{this.code=code;
this.price=price;}
void show()
{System.out.println("code: "+code);
System.out.println("price: "+price);
}}
class Student
{int rollno;
Book b;
Student(int rollno)
{this.rollno=rollno;
}
void setBook()
{b=new Book(125,1000);
} 
void report()
{System.out.println("roll no::"+rollno);
b.show();
}
public static void main(String a[])
{Student st= new Student(101);
st.setBook();
st.report();}}