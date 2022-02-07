package EXP8;

public class Ques4 
{
    static void Occurences(String obj)
    {
        System.out.println("Occurences of 'a' : "); 
        for(int i=0;i<obj.length();i++)
        {
            if(obj.charAt(i)=='a' || obj.charAt(i)=='A')
            {
               System.out.println("Index : "+i);
            }
        }
    }
    public static void main(String[] args)
    {
        //string object initialised to my name 
        String obj = "Prakhar Jadaun";
        System.out.println("String in the object : "+obj);
        //length of my name 
        System.out.println("Length : "+obj.length());
        //checking if 'a' is in my name or not 
        if(obj.contains("a"))
        {
            System.out.println("Yes, the name contains 'a'");
            Occurences(obj);           
        }
        else 
        {
            System.out.println("No, the name has no 'a' character!");
        }
        
        //Another String object 
        String obj2 = "Uttarakhand";
        System.out.println("String in the object : "+obj2);
        //length 
        System.out.println("Length : "+obj2.length());
        //checking if it contains 'a' or not
        if(obj2.contains("a"))
        {
            System.out.println("Yes, it contains 'a'");
            Occurences(obj2);
        }
        else 
        {
            System.out.println("String object do not contains 'a' character!");
        }
    }    
}
