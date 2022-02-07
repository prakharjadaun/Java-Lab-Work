package Exp33.Q5;

public class Minimum 
{
    private static int min(int a,int b)
    {
        if(a>b)
            return b;
        else 
            return a;
    }
    private static float min(float a,float b)
    {
        if(a>b)
            return b;
        else 
            return a;
    } 
    public static void main(String[] args)
    {
        System.out.println(Minimum.min(0.2f,1.6f));
        System.out.println(Minimum.min(10,50));
    }   

}
