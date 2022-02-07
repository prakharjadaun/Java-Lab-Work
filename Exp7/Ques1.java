package EXP7;


import java.util.Scanner;
class Ques1 
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String[] Stud = {"Prakhar","Liam","Noah","Oliver","Elijah","William","Olivia","Emma","Ava","Charlotte"};
        int[] StuR = {1,2,3,4,5,6,7,8,9,10};
        System.out.println();
        try
        {
            System.out.print("Enter the roll number (1-10): ");
            int n = in.nextInt();
            
            System.out.println("Roll Number : "+StuR[n-1]);
            System.out.println("Name of the student : " +Stud[n-1]);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Array index out of bounds exception occured");
        }
        in.close();
    }    
}
