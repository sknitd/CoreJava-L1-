import java.io.Serializable;

/* Program to Serialize a class named Employee.*/
class Employee implements Serializable{
//(5)
String sName;
int iEmpNo;
double dSalary;
public Employee(String sName,int iEmpNo, double dSalary){
this.sName = sName;
this.iEmpNo = iEmpNo;
this.dSalary = dSalary;
}
public String toString(){
return "Name= " + sName + ";Empno= "+ iEmpNo +";Salary= "+dSalary;
//Wipro Technologies
//Page 42Java – Step by Step Lab Guide
}
}