/*-----------Assignment 13: Multilevel Inheritance-------*/

/*-----------Objective : To learn multilevel inheritance and dynamic polymorphism------*/

class Person
{
        String name;
        int d,m,y;
        public Person(String n, int d,int m,int y)
        {
                name = n;
                this.d = d;
                this.m = m;
                this.y = y;
        }
        public void displayDetails()
        {
        System.out.println("Name :"+name);
        System.out.println("DOJ :"+d+"-"+m+"-"+y);
        }
}


class Employee extends Person
{
        int empno;
        double salary;
        public Employee(int empid,String name,int d,int m, int y, double sal)
        {
                super(name,d,m,y);
                empno = empid;
                salary = sal; 
        }
        public void displayDetails()
        {
                super.displayDetails();
                System.out.println("Employee Id :"+empno);
                System.out.println("Salary :"+salary);
        }
}


class Trainee extends Employee
{
        double gpa;
        public Trainee(int empno,String name,int d,int m,int y,double salary,double gpa)
        {
                super(empno,name,d,m,y,salary);
                this.gpa = gpa;
        }
        public void displayDetails()
        {
                super.displayDetails();
                System.out.println(gpa);
        }
}

public class MultilevelDemo
{
        public static void main(String[] args)
        {
                Person personReference;
                Employee emp = new Employee(111,"Rakesh",11,05,1995,40000);
                personReference = emp;
                personReference.displayDetails();
                
                Trainee tr = new Trainee(110,"Ramesh",11,05,1985,20000,7.5);
                personReference = tr;
                personReference.displayDetails();
        }
}
