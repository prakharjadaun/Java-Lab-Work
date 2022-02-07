package string;

import java.util.Scanner;
class Que17
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
    
        System.out.print("Input the string : ");
        String input = scan.next();
        try 
        {
            int index = input.indexOf('x');
            char rep = input.charAt(index-1);

            String sample = input.substring(index+1);
            int index2 = sample.indexOf('x');
            input = input.substring(0,(index+index+2)) + String.valueOf(rep) + input.substring((index+index2+2)+1);
            System.out.println("Final String : "+input);
            
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

