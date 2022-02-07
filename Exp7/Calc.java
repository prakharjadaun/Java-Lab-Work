package EXP7;

import java.util.Scanner; 
public class Calc 
{
    long power(int a,int b)
    {
        return (long)Math.pow(a,b);
    }
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int a=scan.nextInt();
        int b=scan.nextInt();
       
        Calc obj = new Calc();
        try 
        {
            if(a<0 || b<0)
                throw new NegativeException();
            else if(a==0 && b==0)
                throw new ZeroException();
            else 
            {
                System.out.println(obj.power(a, b));
            }
        }
        catch(NegativeException e)
        {
            System.out.println(e);
        }
        catch(ZeroException e)
        {
            System.out.println(e);
        }
        finally
        {
            scan.close();
        }
    }
}
