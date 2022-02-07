package string;


import java.util.Scanner;
class Que4
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        try 
        {
            System.out.print("Input the string : ");
            String input = scan.next();
            char first=input.charAt(4);
            char second=input.charAt(10);

            input = input.substring(0,4) + String.valueOf(second) + input.substring(5, 10) + String.valueOf(first) + input.substring(11);
            System.out.println("String after swapping 4th and 10th letters : "+input);            
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
