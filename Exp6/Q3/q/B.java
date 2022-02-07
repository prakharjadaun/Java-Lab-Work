//creating a package q having a class B
package EXP6.Q3.q;

import EXP6.Q3.p.A;

public class B 
{
    public static void main(String[] args)
    {
        
        //creating a reference varible for an object of class A
        A obj = new A();
        //calling the all public type methods
        System.out.println(obj.abc);
        obj.method1();
        obj.method2();
        obj.method3();
        obj.method4();
    }
}
