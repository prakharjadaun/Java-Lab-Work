package string;

import java.util.Scanner; 
class Que27
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String str1 = scan.nextLine();
        str1 = str1.trim();
        int index = str1.indexOf(' ');
        if(index!=-1)
        {
        int index2 = str1.substring(index+1).indexOf(' ') +index+1;
        String str2 = str1.substring(index+1,index2);
        System.out.println("Index of 'a' in second word : "+(str2.indexOf('a')+index+1));
        }
        else 
        {
            System.out.println("There is no second wordin the string !");
        }
        scan.close();
    }
}

