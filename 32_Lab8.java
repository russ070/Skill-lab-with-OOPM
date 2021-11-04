package inheritnce;
class Employee{
float salary = 46000;
void dispSalary()
{
System.out.println("The Employee salary is :" +salary);
}
}
class PermanentEmp extends Employee{
double hike = 0.8;
void incrementSalary()
{
super.dispSalary();
System.out.println("The Permanent Employee incremented salary is :" +(salary+(salary * hike)) );
}
}
class TemporaryEmp extends Employee{
double hike = 0.25;
void incrementSalary()
{
super.dispSalary();
System.out.println("The Temporary Employee incremented salary is :" +(salary+(salary * hike)) );
}
}
public class HierarchicalInheritanceDemo
{
public static void main(String args[]){
PermanentEmp p = new PermanentEmp();
TemporaryEmp t = new TemporaryEmp();

p.incrementSalary();
t.incrementSalary();
}
}
