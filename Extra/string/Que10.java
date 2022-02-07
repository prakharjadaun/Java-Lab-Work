package string;
import java.util.Scanner; 
class Que10
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
            input = input.substring(0,(index + index2 + 2)-1);
            System.out.println("String before 2nd x : "+input);
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

