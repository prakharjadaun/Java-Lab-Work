package string;

import java.util.Scanner; 
class Que11
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
        
            input = input.substring(0,index) + input.substring((index+index2+2));
            System.out.println("After removing the String between 2 x : "+input);
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
