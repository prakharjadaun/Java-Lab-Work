package EXP7;

public class exception 
{
    public static void main(String[] args)
    {
        try
        { 
            int num1 = Integer.parseInt(args[0]);
            int num2 = Integer.parseInt(args[1]);
            
            System.out.println("Remainder of a and b : "+(num1%num2));
        }    
        catch(NumberFormatException e)
        {
            System.out.println("Operand is non numeric");
        }
    }
}
