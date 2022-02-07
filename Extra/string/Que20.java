package string;

import java.util.Scanner; 
class Que20
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter first String : ");
        String str1 = scan.next();
        System.out.print("Enter second String : ");
        String str2 = scan.next();
        if(str1.compareTo(str2)>0)
        {
            System.out.println("1");
        }
        else if(str1.compareTo(str2)<0)
        {
            System.out.println("2");
        }
        else 
        {
            System.out.println("0");
        }
        scan.close();
    }
}
