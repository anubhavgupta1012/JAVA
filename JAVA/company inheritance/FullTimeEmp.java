class FullTimeEmp extends Employee
{int basic,hra,ta;
FullTimeEmp(int c,int basic)
{set(c);
this.basic=basic;
}
void calc()
{hra= basic*12/100;
ta= basic*10/100;
tax=(basic+hra+ta)*12/100;
netsalary=basic+ta+hra-tax;
}
void show()
{super.show();
System.out.println("basic:"+basic);
System.out.println("har:"+hra);
System.out.println("ta:"+ta);}}

