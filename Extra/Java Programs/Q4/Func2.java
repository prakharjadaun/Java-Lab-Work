package Exp33.Q4;

class Func2
{
    private static int fun(int x)
    {
        return x;
    }
    private static int fun(int x,int y)
    {
        return x+y;
    }
    private static int fun(int x,int y,int z)
    {
        return x*y*z;
    }
    public static void main(String[] args)
    {
        System.out.println(Func2.fun(2));
        System.out.println(Func2.fun(2,3));
        System.out.println(Func2.fun(2,3,4));
    }    
}
