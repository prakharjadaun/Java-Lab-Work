package Exp1.Q7;

import java.util.Scanner; 
public class PositionalVal 
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = in.nextInt();
        int temp=1;
        System.out.println("Positional Values of Digits : ");   //1234
        while(n!=0)
        {
            System.out.println((n%10)*temp);
            n=n/10;
            temp = temp*10;
        }
        in.close();
    } 
}
