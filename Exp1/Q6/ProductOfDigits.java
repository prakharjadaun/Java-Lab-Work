package Exp1.Q6;
import java.util.Scanner; 
public class ProductOfDigits 
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number 1 : ");
        int n1 =scan.nextInt();
        System.out.print("Enter the number 2 : ");
        int n2 = scan.nextInt();
        int result=0;
        while(n1!=0 && n2!=0)  //123 456
        {
            result = result +((n1%10)*(n2%10));
            n1=n1/10;
            n2=n2/10;
        }

        System.out.println("Sum of product of corresponding digits : "+result);
        scan.close();
    }    
}
