package EXP8;

class Ques6 
{
    public static void main(String args[])
    {
        float a = 1.2f;
        System.out.println("Value of a (float) : "+a);

        //converting float to Float 
        Float A = a;   //autoboxing 
        System.out.println("Value of A (float to Float) : "+A);

        //converting Float to String
        String s = String.valueOf(A);
        System.out.println("Value of s (Float to String) : "+s+"\n");

        String temp = "4.0";
        System.out.println("Value of temp (String) : "+temp);
        //converting String to float 
        float b = Float.parseFloat(temp);
        System.out.println("Value of b (String to float) : "+b);

        //converting float to String 
        String t = String.valueOf(b);
        System.out.println("Value of t (float to String) : "+t);

        //converting Float to String 
        Float B = Float.valueOf(t);
        System.out.println("Value of B (Float to String) : "+B);
        
        //converting Float to float 
        float c = B;   //unboxing 
        System.out.println("Value of c (Float to float) : "+c);
    }    
}
