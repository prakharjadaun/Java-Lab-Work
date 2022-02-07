package string;


import java.util.Scanner;
class Que7
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);   
        System.out.print("Input the string : ");
        String input = scan.next();
        //replacing first 'x' by 'y'
        try 
        {
            int index = input.indexOf('x');
            input = input.substring(0,index) + "y" + input.substring(index+1);
            System.out.println("String after replacing first 'x' by 'y' : "+input);
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
