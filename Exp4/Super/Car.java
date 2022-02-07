package Exp4.Super;

public class Car extends Vehicle
{
    Car(int NumOfWheel,String Model,String Company)
    {
        //super(NumOfWheel,Model,Company);
        this.Company=Company;
        this.Model=Model;
        this.NumOfWheel=NumOfWheel;
    }
    void printDetails()
    {
        System.out.println(NumOfWheel);
        System.out.println(Model);
        System.out.println(Company);
    }
}
