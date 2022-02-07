package Exp33.Q1;

class Square 
{
    private static int square(int a)
    {
        return a*a;
    }
    private static double square(double a)
    {
        return a*a;
    }
    public static void main(String[] args)
    {
        System.out.println("Square of 3 : "+Square.square(3));
        System.out.println("Square of 0.2 : "+Square.square(0.2));
    }    
}
