package Exp33.Q3;

class Func
{
    private static int fun(int x)
    {
        return x*x;
    }
    private static int fun(int x,int y)
    {
        return ((x*x) +(y*y));
    }
    public static void main(String[] args)
    {
        System.out.println(Func.fun(2));
        System.out.println(Func.fun(2,3));
    }    
}

