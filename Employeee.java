public class Employeee extends Person {
int iEmpNo;
double dSalary;
int EmployeeeId;
double salary;

public Employeee(int empId, String ename, int eday,int emonth, int eyear, double sal) {
// Call the super class constructor
super(ename, eday, emonth, eyear);
EmployeeeId = empId;
salary = sal;
}
public void displayDetails() {
super.displayDetails();
System.out.println("Employeee Id : "+EmployeeeId);
System.out.println("Salary : "+salary);
}
public static void main(String args[]) {
Person objectPerson = new Person("Sanjay",10,11,1967);
objectPerson.displayDetails();
Employeee objectEmployeee =
new Employeee(111,"Dennis",21,03,2001,48000);
objectEmployeee.displayDetails();
objectPerson = objectEmployeee;
objectPerson.displayDetails();
}
}