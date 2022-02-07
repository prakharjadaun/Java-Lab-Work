package Exp9.Q3;

class Shared 
{
    int counter =0;
    synchronized void SharedMethod()
    {
        Thread t = Thread.currentThread();
        System.out.println("Name of Thread : "+t.getName());
        System.out.println("Value of counter : "+counter++);
    }
}
