package Exp33.Q9;

class Comp2 
{
    int n;
    Comp2() //default 
    {
        n=0;
    }
    Comp2(int n) //parametereised 
    {
        this.n=n;
    }
    public static Comp2 mul(Comp2 b,Comp2 c)
    {
        Comp2 a = new Comp2();
        a.n = b.n * c.n;
        return a;
    }

    public static void main(String[] args)
    {
        Comp2 b = new Comp2(4);
        Comp2 c = new Comp2(5);
        Comp2 a ; 

        a = Comp2.mul(b, c);   //a = b*c
        System.out.println("Value of a : "+a.n);
    }
}
