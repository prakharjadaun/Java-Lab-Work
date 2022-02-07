package EXP6.Q3.p;  //creating a package p having a class A

public class A 
{

    public int abc;
    //class A with public types of access protected methods
    
    //public type method
    public void method1()
    {
        System.out.println("Method 1 accessed....!");
    }    
    //changed to public from default type method 
    public void method2()
    {
        System.out.println("Method 2 accessed....!");
    }
    //changed to public from protected type method
    public void method3()
    {
        System.out.println("Method 3 accessed....!");
    }
    //changed to public from private type method
    public void method4()
    {
        System.out.println("Method 4 accessed....!");
    }
}
