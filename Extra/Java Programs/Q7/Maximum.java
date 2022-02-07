package Exp33.Q7;

public class Maximum 
{
    private static int max(int a,int b)
    {
        if(a>b)
            return a;
        else 
            return b;
    }
    private static float max(float a,float b)
    {
        if(a>b)
            return a;
        else 
            return b;
    } 
    public static void main(String[] args)
    {
        System.out.println(Maximum.max(0.2f,1.6f));
        System.out.println(Maximum.max(10,50));
    }   

}