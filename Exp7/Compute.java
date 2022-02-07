package EXP7;

import java.util.InputMismatchException;
import java.util.Scanner;
public class Compute 
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        try 
        {
            System.out.print("Enter a : ");
            int a= in.nextInt();
            System.out.print("Enter b : ");
            int b = in.nextInt();
            System.out.println(a/b);
        }
        catch(InputMismatchException e)
        {
            System.out.println("java.util.InputMismatchException");
        }
        catch(ArithmeticException e)
        {
            System.out.println("java.lang.ArithmeticException: / by zero");
        }
        finally 
        {
            in.close();
        }
    }    
}
