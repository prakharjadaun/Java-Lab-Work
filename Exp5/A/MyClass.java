package Exp5.A;

public class MyClass implements A
{
    @Override    //annotation to direct compiler that the method is been overridden 
    public void meth1()
    {
        System.out.println("Inside meth1() and MyClass implements meth1() of interface A");
    }   
    
    @Override    //annotation to direct compiler that the method is been overridden 
    public void meth2()
    {
        System.out.println("Inside meth2() and MyClass implements meth2() of interface A");
    }

    public static void main(String[] args)
    {
        MyClass obj = new MyClass();    //creating a reference variable of class MyClass
        obj.meth1();     //calling the method meth1()
        obj.meth2();     //calling the method meth2()
    }
}
