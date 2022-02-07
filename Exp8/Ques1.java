package EXP8;

import java.util.Scanner;
public class Ques1 
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String str = in.nextLine();

        System.out.print("Enter the character or substring of which we have to find the first and the last occurence : ");
        String s = in.next();

        int fIndex = str.indexOf(s);
        int lIndex = str.lastIndexOf(s);
        if(fIndex==-1 && lIndex==-1)
        {
            System.out.println("Entered substring or character do not exist in the string");
        }
        else 
        {
            System.out.println("First occurence : "+fIndex);
            System.out.println("Last occurence : "+lIndex);
        }
        in.close();
    }    
}
