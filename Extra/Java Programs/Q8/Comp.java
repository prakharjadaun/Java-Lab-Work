package Exp33.Q8;

class Comp 
{
    int n;
    Comp(int n)
    {
        this.n=n;
    }

    public void display()
    {
        System.out.println(this.n);
    }

    public void mul(Comp b)
    {

       // n = n*b.n;

        this.n = this.n * b.n;
        //a.n = 4 * 5;

    }

    public static void main(String[] args)
    {
        Comp a = new Comp(4);
        Comp b = new Comp(5);
        a.mul(b);   //a = a*b
        System.out.println("Value of a : "+a.n);
    }
}
