package Exp2;

class LargeOfThree 
{
    public static void main(String[] args)
    {
        int a=Integer.parseInt(args[0]);
        int b=Integer.parseInt(args[1]);
        int c=Integer.parseInt(args[2]);
        if(a>b && a>c)
        {
            System.out.println(a+" is the largest of three");
        }
        else if(b>a && b>c)
        {
            System.out.println(b+" is the largest of the three");
        }
        else 
        {
            System.out.println(c+" is the largest of the three");
        }
    }    
}


/*


class Sample  //your class name will same as of the file name
{
	public static void main(String[] args)
	{
		System.out.println("Hello world..!");
	}
}

//public is an access specifier 

//static : object creation and not creation of the object 
//static means : no object creation required

//we have special class : system which have an object out which have a function println()

//in printf , f stands for format 


int a;
float b;
char c;
double d;
boolean e;



=> class should be declared as a file name 
after compilation, 


nano, code and cat are application software 


javac is a system software. we can create something from the javac like an application

*/

