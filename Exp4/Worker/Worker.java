package Exp4.Worker;

public abstract class Worker
{
    //fields of class Worker
    String Name;
    double SalaryRate;

    Worker(String n, double S)   //constructor of class Worker
    {
        this.Name=n;
        this.SalaryRate=S;
    }
    //method to print details of the worker
    void printWorkerDetails()
    {
        System.out.println();
        System.out.println("Name : "+this.Name);
        System.out.println("Salary Rate : "+this.SalaryRate);
    }
    //abstract method 
    abstract double ComPay(int hours);
}