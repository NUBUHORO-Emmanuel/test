//test real account of the bank
class Account{
int accountn;
String name;
float amount;
void insertRecord(int a,String n,float m)	
{
accountn=a;
name=n;
amount=m;	
}
void deposit(float amt)
{
amount=amount+amt;
System.out.println("the posit amount ="+amt);
}
void withdrow(float amt)
{
if (amount<amt){
System.out.println("insufficient balance");
}
else{
amount=amount-amt;
System.out.println("you are allow to withdrow"+amt);	
}
}
void Display()
{
System.out.println("your balance is ="+amount);
}
void DisplayRecord()
{
	System.out.println("your account number is=  "+accountn +"  names : "+name+"  amount = "+amount);
}
}
class Testaccount{
	public static void main(String[] args){
	Account Ac1 = new Account();
    Ac1.insertRecord(1,"AMAN",2000000);
    Ac1.Display();
    Ac1.withdrow(5000000);
    Ac1.Display();
    Ac1.DisplayRecord();

	}
}