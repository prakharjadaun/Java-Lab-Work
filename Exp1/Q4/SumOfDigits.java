package Exp1.Q4;

import java.util.Scanner; 
public class SumOfDigits 
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = scan.nextInt();
        int result=0;
        while(n!=0)
        {
            result = result + (n%10);
            n=n/10;
        }
        System.out.println("Sum of all the digits : "+result);
        scan.close();
    }    
}
