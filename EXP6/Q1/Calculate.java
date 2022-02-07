package EXP6.Q1;
//importing Scanner
import java.util.Scanner;

import EXP6.Q1.arithmetic.Exp;
import EXP6.Q1.arithmetic.Power;

class Calculate 
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        //creating objects of both the imported classes
        Power p = new Power();   
        Exp e = new Exp();

        System.out.print("Enter the number n : ");
        int n = in.nextInt();
        System.out.print("Enter the power of n (m): ");
        int m = in.nextInt();

        System.out.print("Enter the power of exponent (k): ");
        int k = in.nextInt();

        //using functions defined in the imported packages
        System.out.println("n^m : "+p.pow(n, m));
        System.out.println("e^k : "+e.exp(k));

        in.close();
    }
}

