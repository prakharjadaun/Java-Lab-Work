package Exp2;



class Loop 
{

    //pattern 
    public static void main(String args[]) 
    {
        int n=3;
        
        for(double i=0;i<n;i++)
        {
            for(int j=1;j<=i+2;j++)
            {
                System.out.print("*");
            }

            System.out.println();
        }
    } 

}
