package EXP6.Q1.arithmetic;  //user defined package arithmetic

public class Power 
{
    public int pow(int a,int b)   //to calculate the power 
    {
        int result=1;
        for(int i=0;i<b;i++)
        {
            result*=a;
        }
        return result;
    }
}