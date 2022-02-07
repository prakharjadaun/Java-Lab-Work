package string;

import java.util.Scanner;
class Que18
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        try 
        {
            System.out.print("Input the string : ");
            String input = scan.next();
            char first = input.charAt(0);
            input = input.substring(1);
            int index2 = input.indexOf(first);
        
            char x = input.charAt(index2-1);
            char y = input.charAt(index2+1);
            int indexOfy = input.indexOf(String.valueOf(y));
            input = input.substring(indexOfy);
            
            int indexOfx = input.indexOf(String.valueOf(x));
            input = input.substring(0,indexOfx+1);
            System.out.println("Final String : "+input);            
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Error : "+e);
        }
        finally
        {
            scan.close();
        }
    }    
}


