package Exp2;

class Calculator 
{
    public static void main(String[] args)
    {
        
        int a=Integer.parseInt(args[0]);
        int b=Integer.parseInt(args[2]);
        
        switch(args[1])
        {
            case "+" : System.out.println("Sum of "+a+" and "+b+" is : "+ (a+b));
                        break;
            case "-" : System.out.println("Subtraction of "+a+" and "+b+" is : "+ (a-b));
                        break;
            case "/" : System.out.println("Division of "+a+" and "+b+" is : "+ (a/b));
                        break;
            case "x" : System.out.println("Product of "+a+" and "+b+" is : "+ (a*b));
                        break;
        }
    }    
}
