package Exp33.Q2;

class Cube
{
    private static int cube(int a)
    {
        return a*a*a;
    }
    private static double cube(double a)
    {
        return a*a*a;
    }
    public static void main(String[] args)
    {
        System.out.println("Cube of 3 : "+Cube.cube(3));
        System.out.println("Cube of 0.2 : "+Cube.cube(0.2));
    }    
}
