package string;

import java.util.Scanner;
class Que8
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
    
        System.out.print("Input the string : ");
        String input = scan.next();
        try 
        {
            int index = input.indexOf('x');
            String sample = input.substring(index+1);
            int index2 = sample.indexOf('x');
            System.out.println("Second index of 'x' : "+(index + index2 + 2));
           
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
