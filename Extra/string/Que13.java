package string;


import java.util.Scanner;
class Que13
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
    
        System.out.print("Input the string : ");
        String input = scan.next();
        try
        {            
            int index = input.indexOf('x');
            input = input.substring(0,index-1) + input.substring(index+1,index+2) + "x" + input.substring(index-1,index) + input.substring(index+2);
            System.out.println("After swapping the neighbours of first x : "+input);
            
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

