package string;

import java.util.Scanner;
class Que14
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
    
        System.out.print("Input the string : ");
        String input = scan.next();
        char first = input.charAt(0);
        try 
        {
            input = input.substring(1);
            System.out.println("Second index of first letter : "+(input.indexOf(String.valueOf(first))+1));
        }
        catch(StringIndexOutOfBoundsException e) 
        {
            System.out.println("Error : "+e);
        }
        scan.close();
    }    
}
