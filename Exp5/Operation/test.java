package Exp5.Operation;

import java.util.Scanner; 
public class test implements Operation
{
    @Override     //annotation to direct compiler that the method is been overridden 
    public float division(int n1,int n2)
    {
        return (float)n1/n2;   //returns the quotient of the two numbers s
    }
    @Override    //annotation to direct compiler that the method is been overridden 
    public int modules(int n1,int n2)
    {
        return n1%n2;   //returns the remainder of two number
    }

    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        test obj = new test();     //creating a reference variable of the class test
        //getting the input of two numbers
        System.out.println("Enter the two numbers : ");
        System.out.print("n1 : ");
        int n1 = in.nextInt();
        System.out.print("n2 : ");
        int n2 = in.nextInt();
        //calling the two methods of the interface implemented by the class test
        System.out.println("Division : " + obj.division(n1, n2));
        System.out.println("Modules : "+obj.modules(n1, n2));
        in.close();
    }
}
