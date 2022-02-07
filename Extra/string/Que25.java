package string;

import java.util.Scanner; 
class Que25
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String str1 = scan.nextLine();
        str1 = str1.trim();
        char first = str1.charAt(0);
        int index = str1.indexOf(' ');
        char second = str1.charAt(index+1);
        str1 = String.valueOf(second) + str1.substring(1,index) + " " + String.valueOf(first) + str1.substring(index+2);
        System.out.println("Final String : "+str1);
        scan.close();
    }
}

