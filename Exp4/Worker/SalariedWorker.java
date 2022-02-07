package Exp4.Worker;

public class SalariedWorker extends Worker
{
    SalariedWorker(String n,double S)
    {
        super(n,S);
    }
    //overriding the ComPay(int hours) method of the parent class Worker 
    @Override 
    double ComPay(int hours)
    {
        System.out.println("Computing Weekly pay for Salaried worker (Inside class SalariedWorker)");
        return this.SalaryRate*(40/24) + (this.SalaryRate/24)*16;
    }
}
