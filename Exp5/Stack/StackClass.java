package Exp5.Stack;

import java.util.Scanner;
public class StackClass implements StackInterface
{
    int[] Stack = new int[10];   //integer array for stack 
    int top=-1;                 
    @Override      //overriding the method of interface  
    public void push(int num)      //push operation of the stack 
    {
        if(this.top==Stack.length-1)    //checking the overflow condition
        {
            System.out.println("Overflow...!");
        }
        else
        {
            top++;
            Stack[top]=num;    //pushing into the stack 
        } 
    }
    @Override    //overriding the method of interface stackInterface 
    public void pop()             //pop operation of the stack 
    {
        if(top==-1)       //checking the underflow condition 
        {
            System.out.println("\nUnderflow...!");
        }
        else
        {
            System.out.println(Stack[top]+" is popped from the stack..!");
            top--;     //popping out of the stack 
        } 
    }
    @Override   
    public void displayStack()      //displaying the stack 
    {
        if(top==-1)     //checking if the stack is empty or not 
        {
            System.out.println("\nThe Stack is empty...!");
        }
        else 
        {
            int i=top;
            System.out.println("\nStack elements are : ");
            //displaying the elements 
            for(;i>=0;i--)
            {
                System.out.println(Stack[i]);
            } 
        }
    }

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        boolean check = true;
        StackClass obj = new StackClass();  //creating an instance of class StackClass 

        while(check==true)
        {
            System.out.println("Following operations can be performed : ");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Display");
            System.out.print("Enter your choice : ");
            int temp = in.nextInt();

            switch(temp)
            {
                case 1 : 
                        {
                            System.out.print("Enter the value you want to push : ");
                            int num = in.nextInt();
                            obj.push(num);
                            break;
                        }
                case 2 : 
                        obj.pop();
                        break;
                case 3 : 
                        obj.displayStack();
                        break;
                default : System.out.println("Invalid input...!");
            }
            System.out.print("Do you want to perform more ? (true/false) : ");
            check = in.nextBoolean();
        }
        in.close();
    }
}
