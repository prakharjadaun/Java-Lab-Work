package EXP7;

import java.util.Scanner; 
public class temp 
{
    public static void main(String[] args) throws MyException
    {
        Scanner in = new Scanner(System.in);
        try 
        {
            System.out.print("Enter the number : ");
            int n = in.nextInt();
            if(n<500)
                throw new MyException(n);
            System.out.println("Entered number is : "+n);
            System.out.println("Number is greater than 500!");
        }
        catch(MyException e)
        {
            System.out.println(e);
        }
        finally 
        {
            in.close();
        }
    }
}
