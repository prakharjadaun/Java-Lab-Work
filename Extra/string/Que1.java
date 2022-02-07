package string;

import java.util.Scanner;
class Que1 
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        try 
        {
            System.out.print("Input the string : ");
            String input = scan.next();

            //removing the 2nd letter 
            input = input.substring(0,2) + input.substring(3);
            System.out.println("After removing the second letter : "+input);
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
