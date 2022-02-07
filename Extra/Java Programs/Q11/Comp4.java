package Exp33.Q11;

import java.util.Scanner;
public class Comp4
{
    double real;
    double img;
    Comp4()
    {
        this.real=0;
        this.img=0;
    }
    Comp4(double r,double i)
    {
        this.real=r;
        this.img=i;
    }

    public Comp4 divide(Comp4 c)
    {
        Comp4 a = new Comp4();
        a.real = ((this.real*c.real)+(c.img*this.img))/((c.real*c.real)+(c.img*c.img)); 
        a.img = ((this.img*c.real)-(this.real*c.img))/((c.real*c.real)+(c.img*c.img));
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
        Comp4 b = new Comp4(r,i);

        System.out.print("Enter the real part : ");
        r = scan.nextInt();
        System.out.print("Enter the imaginary part : ");
        i = scan.nextInt();
        Comp4 c = new Comp4(r,i);

        Comp4 a;
        a = b.divide(c);
        System.out.println("Complex number a : "+a.real+"+"+"("+a.img+"i)");
        scan.close();
    }
}
