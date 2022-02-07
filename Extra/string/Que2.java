package string;


import java.util.Scanner;
class Que2
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        try 
        {
            System.out.print("Input the string : ");
            String input = scan.next();
            System.out.print("Enter the character at to be placed at 0th index : ");
            String str = scan.next();

            input = str + input;
            System.out.println("String after modification : "+input);           
        }
        catch(Exception e)
        {
            System.out.println("Error : "+e);
        }
        finally
        {
            scan.close();
        }
    }    
}