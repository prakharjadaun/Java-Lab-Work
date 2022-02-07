package Exp33.Q12;

import java.util.Scanner;
public class Comp5
{
    double real;
    double img;
    Comp5()
    {
        this.real=0;
        this.img=0;
    }
    Comp5(double r,double i)
    {
        this.real=r;
        this.img=i;
    }

    public static Comp5 divide(Comp5 b,Comp5 c)
    {
        Comp5 a = new Comp5();
        a.real = ((b.real*c.real)+(c.img*b.img))/((c.real*c.real)+(c.img*c.img)); 
        a.img = ((b.img*c.real)-(b.real*c.img))/((c.real*c.real)+(c.img*c.img));
        return a;
    }
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        double r,i;
        System.out.println("Enter the complex number : ");
        System.out.print("Enter the real part : ");
        r = scan.nextDouble();
        System.out.print("Enter the imaginary part : ");
        i = scan.nextDouble();
        Comp5 b = new Comp5(r,i);

        System.out.print("Enter the real part : ");
        r = scan.nextInt();
        System.out.print("Enter the imaginary part : ");
        i = scan.nextInt();
        Comp5 c = new Comp5(r,i);

        Comp5 a;
        a = Comp5.divide(b,c);
        System.out.println("Complex number a : "+a.real+"+"+"("+a.img+"i)");
        scan.close();
    }
}

