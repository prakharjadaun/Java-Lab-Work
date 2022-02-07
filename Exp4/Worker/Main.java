package Exp4.Worker;
import java.util.Scanner; 
public class Main 
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String n;
        double SalaryRate;
        int hrs1;
       
        //getting the input for daily wage worker 
        System.out.println("Enter the details for the Daily Worker : ");
        System.out.print("Enter the name : ");
        n = in.nextLine();
        System.out.print("Enter the Salary Rate : ");
        SalaryRate=in.nextDouble();
        System.out.print("Enter the number of hours : ");
        hrs1 = in.nextInt();

        //instantiating an object of class Dailyworker
        DailyWorker Dworker= new DailyWorker(n, SalaryRate);

        //getting the input for salaried worker 
        System.out.println("Enter the details for the Salaried Worker : ");
        System.out.print("Enter the name : ");
        n = in.next();
        System.out.print("Enter the Salary Rate : ");
        SalaryRate=in.nextDouble();

        //instantiating an object of class Salaried Worker
        SalariedWorker Sworker = new SalariedWorker(n, SalaryRate);

        Dworker.printWorkerDetails();
        System.out.println("Week Pay : "+Dworker.ComPay(hrs1));

        Sworker.printWorkerDetails();
        System.out.println("Week Pay : "+Sworker.ComPay(40));
        in.close();
    }    
}
