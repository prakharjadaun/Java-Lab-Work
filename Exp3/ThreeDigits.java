package Exp3;


import java.util.Scanner;
class ThreeDigits 
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int arr[] = new int[3];
        System.out.println("Enter the three digits (0-9) : ");
        System.out.print("Enter digit 1 : ");
        arr[0] = in.nextInt();
        System.out.print("Enter digit 2 : ");
        arr[1]= in.nextInt();
        System.out.print("Enter digit 3 : ");
        arr[2] = in.nextInt();

        System.out.println("All possible combinations of the three digits are : ");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                for(int k=0;k<3;k++)
                {
                    if(i!=j && j!=k && k!=i)
                    {
                        System.out.printf("%d%d%d\n",arr[i],arr[j],arr[k]);
                    }
                }
            }
        }
        in.close();
    }
}
