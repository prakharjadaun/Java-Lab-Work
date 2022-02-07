package Exp1.Q1;

import java.util.Scanner;
public class KDigit 
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = scan.nextInt();
        System.out.print("Enter the value of k : ");
        int k = scan.nextInt();
        int i=0;
        while(i<k-1)   //1 2 3 4 5
        {
            n=n/10;   
            i++;
        }
        System.out.println("Kth digit from last : "+(n%10));
        scan.close();
    }    
}
