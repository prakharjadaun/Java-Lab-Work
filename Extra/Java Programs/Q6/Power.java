package Exp33.Q6;

public class Power 
{
    private static int power(int x,int n)
    {
        int result=1;
        for(int i=0;i<n;i++)
        {
            result *= x;
        }
        return result;
    }

    private static float power(float x,float n)
    {
        float result=1;
        for(float i=0;i<n;i++)
        {
            result *= x;
        }
        return result;
    }

    public static void main(String args[])
    {
        System.out.println(Power.power(2, 3));
        System.out.println(Power.power(0.2f, 3.0f));
    }
    
}
