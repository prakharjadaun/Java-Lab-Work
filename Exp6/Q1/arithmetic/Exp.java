//created a user defined package
package EXP6.Q1.arithmetic;  //user defined package arithmetic
public class Exp     
{
    public double exp(int n)    //to calculate the exponent
    {
        double result=1;
        for(int i=0;i<n;i++)
        {
            result*=2.71;
        }
        return result;
    }
}