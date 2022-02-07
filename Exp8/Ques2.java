package EXP8;

import java.util.Scanner;
public class Ques2 
{
    public static void main(String[] args)
    {
        StringBuffer str = new StringBuffer();
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the string : ");
        str.append(in.nextLine());
        //converting to the upper case without inbuilt function
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)>=97 && str.charAt(i)<=122)
            {  
                str.insert(i,(char)(str.charAt(i)-32));
                str.deleteCharAt(i+1);
            }
        }
        System.out.println("Capitalized String : "+str); 
        in.close();
    }    
}
