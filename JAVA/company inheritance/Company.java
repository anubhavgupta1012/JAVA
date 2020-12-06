class Company
{public static void main(String []s)
{PartTimeEmp pe= new PartTimeEmp();
FullTimeEmp fe= new FullTimeEmp(102,10000);
pe.set(101,100,150);
pe.calc();
fe.calc();
pe.show();
fe.show();
}}
