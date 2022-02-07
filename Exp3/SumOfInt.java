package Exp3;

public class SumOfInt 
{
    public static void main(String[] args)
    {
        int n = 0;
        for(int i=41;i<250;i++)
        {
            if(i%5==0)
            {
                n+=i;
            }
        }
        System.out.println("Sum of all the numbers between 40 and 250 and are divisible by 5 are : "+n);
    }        
}
