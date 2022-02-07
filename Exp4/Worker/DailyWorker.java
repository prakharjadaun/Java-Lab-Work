package Exp4.Worker;



public class DailyWorker extends Worker
{
    //int Hrs;
    DailyWorker(String n, double S)
    {
        super(n,S);
       // this.Hrs=hrs;
    }

    //overriding the ComPay(int hours) method of class Worker 
    @Override
    double ComPay(int hours)  //
    {
        System.out.println("Computing Weekly pay for Daily Worker (Inside class DailyWorker)");
        double days = hours/24;
        int hrs = hours%24;
                 
        double temp = this.SalaryRate*days + (this.SalaryRate/24)*hrs;
        return temp; 
    }
}
