package string;

import java.util.Scanner; 
class Que28
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
            String str2 = str1.substring(index+1);
            int finalIndex = (str2.indexOf(str1.charAt(0))+index+1);
            if(finalIndex==index)
            {
                System.out.println("There is not first letter of first word in second word");
            }
            else 
            {
                System.out.println("Index of "+ str1.charAt(0) +" in second word : "+finalIndex);
            }
        }
        else 
        {
            System.out.println("There is no second wordin the string !");
        }
        scan.close();
    }
}
