package Exp33.Q10;

import java.util.Scanner;
public class Comp3 
{
    int real;
    int img;
    Comp3(int r,int i)
    {
        this.real=r;
        this.img=i;
    }
    public void Conjugate()
    {
                           
        System.out.println("Complex Number : ("+this.real+"+("+this.img+"i))");
        //if(this.img>=0)
                            
        System.out.println("Conjugate : ("+this.real+"-"+(this.img)+"i)");
        //else 
        //System.out.println("Conjugate : ("+this.real+"+"+(-1*this.img)+"i)");
    }
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int r,i;
        System.out.println("Enter the complex number : ");
        System.out.print("Enter the real part : ");
        r = scan.nextInt();
        System.out.print("Enter the imaginary part : ");
        i = scan.nextInt();
        Comp3 obj = new Comp3(r,i);
        obj.Conjugate();
        scan.close();
    }
}
