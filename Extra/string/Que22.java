package string;

import java.util.Scanner; 
class Que22
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String str1 = scan.nextLine();
        str1 = str1.trim();
        int index = str1.indexOf(' ');
        str1 = str1.substring(0,index);
        System.out.println("First word of the string : "+str1);
        scan.close();
    }
}


