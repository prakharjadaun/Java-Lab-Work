package string;

import java.util.Scanner;
class Que16
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
    
        System.out.print("Input the string : ");
        String input = scan.next();
        try
        {
            char temp = input.charAt(input.indexOf('x')-1);
            int index = input.indexOf(temp);
            char left = input.charAt(index-1);
            char right = input.charAt(index+1);

            input = input.substring(0,index-1) + String.valueOf(right) + String.valueOf(input.charAt(index)) + String.valueOf(left) + input.substring(index+2);
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
