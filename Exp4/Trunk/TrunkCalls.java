package Exp4.Trunk;

import java.util.Scanner; 
public class TrunkCalls 
{
    double duration;
    String TypeOfCall;

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the ordinary charge : ");
        int ordinaryCharge=in.nextInt();
        System.out.print("Enter the Urgent charge : ");
        int urgentCharge=in.nextInt();
        System.out.print("Enter the lighting charge : ");
        int lightingCharge=in.nextInt();

        System.out.print("Enter the duration of ordinary call : ");
        double period = in.nextDouble();

        Ordinary ObjOrdinary = new Ordinary(period);
        System.out.print("Enter the duration of Urgent call : ");
        period = in.nextDouble();
        Urgent ObjUrgent = new Urgent(period);
        System.out.print("Enter the duration of Lighting call : ");
        period = in.nextDouble();
        Lighting ObjLighting = new Lighting(period);
        
        System.out.println();
        ObjOrdinary.printDetails();
        System.out.println("Total Charges : "+ObjOrdinary.ChargeCalculation(ordinaryCharge)+"\n");
        ObjUrgent.printDetails();
        System.out.println("Total Charges :"+ObjUrgent.ChargeCalculation(urgentCharge)+"\n");
        ObjLighting.printDetails();
        System.out.println("Total charges : "+ObjLighting.ChargeCalculation(lightingCharge));
        in.close();
    }

    void printDetails()
    {
        System.out.println("Type Of call : "+this.TypeOfCall);
        System.out.println("Duration of call : "+this.duration);
    }
}
