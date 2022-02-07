package string;


import java.util.Scanner;
class Que6
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in); 
        System.out.print("Input the string : ");
        String input = scan.next();
        //string after first 'x' in the string 
        try 
        {
            int index = input.indexOf('x');
            System.out.println("String after first 'x' : "+input.substring(index+1));
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
