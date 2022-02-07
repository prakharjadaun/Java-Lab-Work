package Exp9.Q4;

class Priority extends Thread   //extending the Thread class 
{
    public Priority(String string) 
    {
        this.setName(string);
    }
    @Override
    public void run()   //overrided run method 
    {
        int p=Thread.currentThread().getPriority();  //getting the priority of the currnt running thread
        
        if(p==MAX_PRIORITY)
        {
            Thread.currentThread();
            try 
            {
                Thread.sleep(2000);
            } 
            catch (InterruptedException e) 
            {
                e.printStackTrace();
            }
        }
        System.out.println(Thread.currentThread().getName()+"is runnning...");
    }
    public static void main(String[] args)
    {
        //creating 5 threads and setting priority of 2 threads as the max priority
        Priority t1 = new Priority("Thread 1");
        t1.setPriority(MAX_PRIORITY);
        Priority t2 = new Priority("Thread 2");
        t2.setPriority(3);
        Priority t3 = new Priority("Thread 3");
        t3.setPriority(6);
        Priority t4 = new Priority("Thread 4");
        t4.setPriority(4);
        Priority t5 = new Priority("Thread 5");
        t5.setPriority(MAX_PRIORITY);
        //starting all the threads 
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        long l=System.currentTimeMillis();
        String s="";
        while(t1.isAlive() || t2.isAlive() ||t3.isAlive() || t4.isAlive() || t5.isAlive())
        {
            if(t1.isAlive())
            {
                s=t1.getName();
            }
            else if(t2.isAlive())
            {
                s=t2.getName();
            }
            else if(t3.isAlive())
            {
                s=t3.getName();
            }
            else if(t4.isAlive())
            {
                s=t4.getName();
            }
            else if(t5.isAlive())
            {
                s=t5.getName();
            }
        }   
        System.out.println("long lasting thread is : "+s+"\nTime taken : "+(System.currentTimeMillis()-l));  //printing the long lasting thread 
    }
}
