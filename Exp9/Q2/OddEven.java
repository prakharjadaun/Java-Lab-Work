package Exp9.Q2;

public class OddEven 
{
    public static void main(String[] args) throws InterruptedException
    {
        Thread t1 = new Thread()    //thread 1
        {
            @Override
            public void run()     //run() for thread 1 for printing even numbers 
            {
                for(int i=0;i<=10;i+=2)
                {
                    System.out.println("Even number : "+i);
                }
            }
        };

        Thread t2 = new Thread()    //thread 2 
        {
            @Override 
            public void run()   //run() for thread 2 for printing odd numbers 
            {
                for(int i=1;i<10;i+=2)
                {
                    System.out.println("Odd number : "+i);
                }
            }
        };
        t1.start();   //thread 1 moved to runnable state
        t2.start();   //thread 2 moved to runnable state
    }
}
