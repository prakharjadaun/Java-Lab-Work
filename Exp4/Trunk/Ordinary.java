package Exp4.Trunk;

public class Ordinary extends TrunkCalls
{
    Ordinary(double dur)
    {
        this.duration=dur;
        this.TypeOfCall="Ordinal";
    }

    double ChargeCalculation(int charges)
    {
        return this.duration*charges;
    }

}
