package string;

import java.util.Scanner; 
class Que24
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String str1 = scan.nextLine();
        str1 = str1.trim();
        int index = str1.indexOf(' ');
        String first = str1.substring(0,index);
        String second = str1.substring(index+1);
        if(second.indexOf(' ')!=-1)
        {
            int index2 = second.indexOf(' ');
            second = second.substring(0,index2);
            str1 = second + " " + first + " " + str1.substring( index + index2 + 2);
        }
        else 
        {
            str1 = second +" "+ first;
        }
        System.out.println("After exchanging first and second word of string : "+str1);
        scan.close();
    }
}
