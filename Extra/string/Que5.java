package string;


import java.util.Scanner;
class Que5
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        try 
        {
            System.out.print("Input the string : ");
            String input = scan.next();
            //inserting 't' between 1st and 2nd letter
            input = input.substring(0,2) + "t" + input.substring(2);
            System.out.println("String after inserting 't' : "+input);            
        }
        catch(StringIndexOutOfBoundsException e)
        {
            System.out.println("Error : "+e);
        }
        finally
        {
            scan.close();
        }
    }    
}
