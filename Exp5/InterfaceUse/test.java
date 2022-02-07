package Exp5.InterfaceUse;

public class test implements Sample
{
    @Override       //annotation to direct compiler that the method is been overridden 
    public void changeVal(int n)
    {
        //previously value was initialised value 20
        //value = n;
    }  
    @Override       //annotation to direct compiler that the method is been overridden 
    public void printVal()
    {
        System.out.println("Value : "+value);
    } 

    public static void main(String args[])
    {
        test obj = new test();
        obj.changeVal(30);   //changing the value of field value 
        obj.printVal();     //calling the printVal() func
    }
}
