import java.util.Scanner;

public class Banklab2java {
    Scanner in=new Scanner(System.in);
    
    String name;
    
    char account_type;
	int account_number,amount;
	float balance;
	

	public Banklab2java(String n,int a, char t, float b) {

		// TODO Auto-generated constructor stub

		name = n;

		account_number=a;

		account_type=t;

		balance=b;



	}

	

	int deposit()

	{

		System.out.println("Enter the amount to	deposit: ");

		int amount=in.nextInt();

		if(amount<0)

		{

			System.out.println("Invalid amount,Enter a valid amount"); 

			return 0;

		}

		balance=balance+amount;

		return 1;

	}

	

	int withdraw()

	{

		System.out.println("Your Balance= "	+balance ); 

		System.out.println("Enter amount to withdraw: "); 

		int amount=in.nextInt();

		if (balance<amount)

		{

			System.out.println("Insufficient Balance:	"); 

			return 0;

		}

		if(amount<0)

		{

			System.out.println("Invalid	amount" ); 

			return 0;

		}

		balance=balance-amount; 

		return 1;

	}

	

	void display()

	{

		System.out.println("Name :"+name);

		System.out.println("Account Number:" +account_number);

		System.out.println("Account Type:" +account_type);

		System.out.println("Balance: " +balance);

	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj =new Scanner(System.in);

		Banklab2java b1=new Banklab2java("salman",1,'s',2000);

		Banklab2java b2=new Banklab2java("makarand",2,'s',2000);

		Banklab2java b3=new Banklab2java("siddharth",3,'s',2000);

		

		System.out.println("Menu");

		System.out.println("1.Deposit");

		System.out.println("2.Withdraw");

		System.out.println("3.Display");

		System.out.println("Enter option"); 

		int op=obj.nextInt();

		char ans;

		do

		{

			System.out.println("Please enter your account number:"); 

			int account_number=obj.nextInt();		

				switch(account_number)

				{

					case 1:	if(op==1)

								b1.deposit();

							if(op==2)

								b1.withdraw();

							if(op==3)

								b1.display();

							

							break;

					case 2:	if(op==1)

								b2.deposit();

							if(op==2)

								b2.withdraw();

							if(op==3)

								b2.display();

							

							break;

					case 3:	if(op==1)

								b3.deposit();

							if(op==2)

								b3.withdraw();

							if(op==3)

								b3.display();

							

							break;

					default: System.out.println("Enter value between 1 to 3");

							break;

				}

				System.out.println("Do you want to continue?[Y/N]");

				ans=obj.next().charAt(0);  //char input in variable ans

				if(ans=='Y' || ans == 'y') 

				{

					System.out.println("Menu");

					System.out.println("1.Deposit");

					System.out.println("2.Withdraw");

					System.out.println("3.Display");

					System.out.println("Enter option"); 

					op=obj.nextInt();

				}

					

			}

			while(ans!='N');

	}
}




//S1 S2
import java.util.Scanner;
class Student
{
 Scanner in=new Scanner(System.in);
 String name;
 int rollno;
 String department;
 float cgpa;

//method overloading
void getData()
{
 Scanner t = new Scanner(System.in);
System.out.println("Student name =");
name= t.next();
System.out.println("Student rollno =");
rollno= t.nextInt();
System.out.println("Student department =");
department= t.next();
System.out.println("Student cgpa=");
cgpa= t.nextFloat();
}
void getdata( String n, int r, String d, float c)
{
name=n;
rollno=r;
department=d;
cgpa=c;
}
void printdata()
{
System.out.println("Student name =" +name);
System.out.println("Student rollno =" +rollno);
System.out.println("Student department ="+department);
System.out.println("Student cgpa ="+cgpa);
}
};
public class StudentTest
{
public static void main(String args[])
{
Student s1=new Student();
Student s2=new Student();
s1.getData(); //non parameter
s1.printdata();
s2.getdata("ram", 25, "EXTC", (float)9.8 );
s2.printdata();
}
}
