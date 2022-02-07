package string;

import java.util.Scanner;
class Que15
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
            int index2 = sample.indexOf('y');
            input = input.substring(0,(index+index2+2)-1) + input.substring((index+index2+2));
            System.out.println("After deletion of y after first x : "+input);            
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
