package string;

import java.util.Scanner; 
class Que23
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String str1 = scan.nextLine();
        str1 = str1.trim();
        int index = str1.indexOf(' ');
        str1 = str1.substring(index+1);
        if(str1.indexOf(' ')!=-1)
        {
            index = str1.indexOf(' ');
            str1 = str1.substring(0,index);
        }
        System.out.println("Second word of the string : "+str1);
        scan.close();
    }
}
