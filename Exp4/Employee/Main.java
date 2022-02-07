package Exp4.Employee;

public class Main 
{
    public static void main(String[] args)
    {
        Employee obj = new Employee("Prakhar Jadaun",22,35_000);    //reference variable of class Employee
        Manager obj2 = new Manager("Ravi Tomar",1,75_000,"AI");  //reference varable of class Manager

        //getting the name of the employee from the Employee class's object
        System.out.println("Name of the employee : "+obj.getName());
        //getting the salary of the employee from the Employee class's object
        System.out.println("Salary : "+obj.getSalary());
        obj.increaseSalary(20);
        //Salary after increasing by 20%
        System.out.println("Salary after increment : "+obj.getSalary());

        //getting the name of the Manager 
        System.out.println("\nName of the manager : "+obj2.getName());
        //department of the manager 
        System.out.println("Department : "+obj2.department);
        //getting the salary of the manager
        System.out.println("Salary : "+obj2.getSalary());
        obj2.increaseSalary(30);
        //Salary after increasing by 30%
        System.out.println("Salary after increment : "+obj2.getSalary());
    }    
}
