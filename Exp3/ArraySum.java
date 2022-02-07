package Exp3;


import java.util.Scanner;
public class ArraySum 
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.println("Enter the array elements : ");
        for(int i=0;i<10;i++)
        {
            System.out.print("Element "+(i+1)+" : ");
            arr[i] = in.nextInt();
        }
        int temp=0;
        System.out.println("Square of the numbers are : ");
        for(int i=0;i<10;i++)
        {
            System.out.printf("%d : %d\n",arr[i],arr[i]*arr[i]);
            temp += (arr[i]*arr[i]);
        }
        System.out.println("Sum of all the sqaured numbers : "+temp);

        in.close();
    }
}
