package Exp4.Employee;

public class Manager extends Employee
{
    String department;  //instance variable of class Manager 
    Manager(String name,int empid,double salary,String department)   //constructor of the class Manager
    {
        super(name, empid, salary);     //parent class' (Employee) constructor called
        this.department=department;
    }
}
