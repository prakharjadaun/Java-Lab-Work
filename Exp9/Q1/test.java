package Exp9.Q1;

class test implements Runnable   //Threads by implementing runnable interface
{
    @Override
    public void run()     //implementing the run() function of the Runnable interface
    {
        System.out.println("Thread is running...!");
        for(int i=0;i<5;i++)
        {
            System.out.println(i);
        }
    }

    public static void main(String[] args)
    {
        test obj = new test();     //obj as reference variable of class test
        Thread t1 = new Thread(obj);   
        t1.start();

        Thread t2 = new Thread(obj);
        t2.start();

    }
}
