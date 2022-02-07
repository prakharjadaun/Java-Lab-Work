package Exp1.Q3;

import java.util.Scanner; 
public class SecondDigit 
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = scan.nextInt();
        while(n/100!=0)
        {
            n=n/10;
        }
        System.out.println("Second digit : "+(n%10));
        scan.close();
    }    
}
