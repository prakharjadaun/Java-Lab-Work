package string;


import java.util.Scanner;
class Que3
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        try 
        {
            System.out.print("Input the string : ");
            String input = scan.next();
            char first=input.charAt(0);
            char second=input.charAt(1);

            input = String.valueOf(second) + String.valueOf(first) + input.substring(2);
            System.out.println("String after swapping first two letters : "+input);            
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
