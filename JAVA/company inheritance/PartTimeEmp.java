class PartTimeEmp extends Employee
{int rate,noh;
void set(int c,int r,int noh)
{ set(c);
this.rate=rate;
this.noh=noh;
}
void calc()
{
tax=(noh*rate)*10/100;
netsalary=noh*rate-tax;
}
void show()
{super.show();
System.out.println("no. of hours="+noh);
System.out.println("rate per hour ="+rate);
}}
