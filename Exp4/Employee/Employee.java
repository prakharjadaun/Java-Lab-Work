package Exp4.Employee;

public class Employee 
{
    //fields of the class Employee
    String name;
    int empid;
    double salary;
    
    Employee()     //default constructor 
    {
        name="";
        empid=0;
        salary=0.0;
    }

    Employee(String name,int empid,double salary)   //parameterised constructor 
    {
        this.name=name;
        this.empid=empid;
        this.salary=salary;
    }

    String getName()         //method to return name of the employee
    {
        return this.name;
    }

    double getSalary()       //method to return the salary of the employee
    {
        return this.salary;
    }

    void increaseSalary(double num)    //method to increment the salary by the user's percentage
    {
        double temp = this.salary*(num/100);
        this.salary=this.salary+temp;
    }
}
