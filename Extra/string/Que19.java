package string;

import java.util.Scanner; 
class Que19 
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
            System.out.println("Bigger String : "+str1);
            System.out.println("Smaller String : "+str2);
        }
        else if(str1.compareTo(str2)<0)
        {
            System.out.println("Bigger String : "+str2);
            System.out.println("Smaller String : "+str1);
        }
        else 
        {
            System.out.println("Both the strings are equal!");
            System.out.println("String : "+str1);
        }
        scan.close();
    }
}
