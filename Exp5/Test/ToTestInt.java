package Exp5.Test;

import java.util.Scanner; 
public class ToTestInt 
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);   
        System.out.print("Enter the number you want to find the sqaure (int) : ");
        int n = in.nextInt();
        arithmetic obj = new arithmetic();   //creating a refernce variable to the class airthmetic
        System.out.println("Square of number is : "+obj.square(n));    //calling the square() function to get the square of the int
        in.close();
    }    
}
