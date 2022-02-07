package string;


import java.util.Scanner;
class Que12
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
            String first = input.substring(0, index);
            String second = input.substring(index+1,(index + index2 + 2)-1);                input = second + "x" + first + "x" + input.substring((index+index2+2));
            System.out.println("after swapping the first and the second string : "+input);
            
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

