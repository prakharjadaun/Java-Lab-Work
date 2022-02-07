package Exp9.Q1;



class thread extends Thread    //Example of thread by extending the Thread class
{
    public synchronized void run()
    {
        //System.out.println("Thread is running...!");
        // for(int i=0;i<5;i++)
        // {
        //     System.out.println(i);
        // }
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getPriority());
        System.out.println();
    }
    public static void main(String[] args)
    {
        thread t1 = new thread();
        t1.start();  //thread 1 starts
        t1.setName("Thread 1");
        t1.setPriority(1);


        thread t2 = new thread();
        t2.start();   //thread 2 starts executing 
        t2.setName("Thread 2");
        t2.setPriority(10);

        thread t3 = new thread();
        t3.start();   //thread 2 starts executing 
        t3.setName("Thread 3");
        t3.setPriority(5);

        thread t4 = new thread();
        t4.start();   //thread 2 starts executing 
        t4.setName("Thread 4");
        t4.setPriority(3);
    }
}
