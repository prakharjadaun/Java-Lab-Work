package Exp1.Q5;

import java.util.Scanner;
public class Product 
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = scan.nextInt();
        int result=0;
        while(n/10!=0)  //23145
        {                     
            result = result + ((n%10)*((n%100)/10));
            n=n/10;
        }
        System.out.println("Sum of product of consecutive digits : "+result);
        scan.close();
    }    
}
