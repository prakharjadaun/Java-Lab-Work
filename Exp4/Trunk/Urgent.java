package Exp4.Trunk;

public class Urgent extends TrunkCalls
{
    Urgent(double dur)
    {
        this.duration=dur;
        this.TypeOfCall="Urgent";
    }

    double ChargeCalculation(int charges)
    {
        return this.duration*charges;
    }
}
