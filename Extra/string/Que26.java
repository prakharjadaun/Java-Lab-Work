package string;

import java.util.Scanner; 
class Que26
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String str1 = scan.nextLine();
        str1 = str1.trim();
        int index = str1.indexOf(' ');
        char first = str1.charAt(index-1);
        String str2 = str1.substring(index+1);
        if(str2.indexOf(' ')!=-1)
        {
            int index2 = str2.indexOf(' ');
            char second = str1.charAt(index + index2);
            str1 = str1.substring(0,index-1) + String.valueOf(second) + " " + str1.substring(index+1,index + index2)+ String.valueOf(first) + str1.substring(index + index2+1);
        }
        else 
        {
            char second = str1.charAt(str1.length()-1);
            str1 =  str1.substring(0,index-1) + String.valueOf(second) +" "+ str1.substring(index+1,str1.length()-1) +String.valueOf(first);
        }
        System.out.println("Final String : "+str1);
        scan.close();
    }
}
