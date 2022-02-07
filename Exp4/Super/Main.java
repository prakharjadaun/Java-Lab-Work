package Exp4.Super;

public class Main 
{
    public static void main(String[] args)
    {
        Car obj = new Car(4,"R8","Audi");
        obj.printDetails();
    }
}

/*
public class AccessCheck 
{
    public static void main(String[] args)
    {
        var car1 = new Car("Mercedes","R8",4);
        car1.printDetails();                                          
    }   
    static class Vehicle
    {
        //private fields of the parent class
        private String Name;
        private String ModelNo;
        private int NumOfwheels;
    } 

    static class Car extends Vehicle 
    {
        Car(String name, String Modelnum, int Numofwheels)
        {
            this.Name= name;
            this.ModelNo= Modelnum;
            this.NumOfwheels= Numofwheels;
        }
        void printDetails()
        {
            System.out.println("Name of the car : "+this.Name);
            System.out.println("Model Number : "+this.ModelNo);
            System.out.println("Number of Wheels : "+this.NumOfwheels);
        }
    }
}
*/