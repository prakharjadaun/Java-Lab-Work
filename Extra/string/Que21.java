package string;

import java.util.Scanner; 
class Que21 
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter first String : ");
        String str1 = scan.next();
        System.out.print("Enter second String : ");
        String str2 = scan.next();
        System.out.print("Enter the third string : ");
        String str3 = scan.next();
        if(str1.compareTo(str2)>0 && str1.compareTo(str3)>0)
        {
            System.out.println("1");
        }
        if(str2.compareTo(str1)>0 && str2.compareTo(str3)>0)
        {
            System.out.println("2");
        }
        if(str3.compareTo(str1)>0 && str3.compareTo(str2)>0)
        {
            System.out.println("3");
        }
        if(str1.compareTo(str2)==0 && str1.compareTo(str3)==0)
        {
            System.out.println("0");
        }
        if(str1.compareTo(str2)==0 && str1.compareTo(str3)>0)
        {
            System.out.println("-1");
        }
        if(str2.compareTo(str3)==0 && str2.compareTo(str1)>0)
        {
            System.out.println("-2");
        }
        if(str1.compareTo(str3)==0 && str1.compareTo(str2)>0)
        {
            System.out.println("-3");
        }
        scan.close();
    }
}

