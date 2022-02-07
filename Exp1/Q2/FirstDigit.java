package Exp1.Q2;
import java.util.Scanner; 

public class FirstDigit 
{
    
    public static void main(String[] args)
    {
        
        //instance = reference 
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n=scan.nextInt();  //12345
        while(n/10!=0)  
        {
            n=n/10;
        }
        System.out.println("First digit : "+(n));
        scan.close();

    }    
}




