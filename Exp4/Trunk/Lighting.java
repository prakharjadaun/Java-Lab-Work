package Exp4.Trunk;

public class Lighting extends TrunkCalls
{
    Lighting(double dur)
    {
        this.duration=dur;
        this.TypeOfCall="Lighting";
    }

    double ChargeCalculation(int charges)
    {
        return this.duration*charges;
    }
}
