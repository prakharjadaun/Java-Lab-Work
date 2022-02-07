package EXP8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ques3 
{
    public static void main(String[] args) throws IOException
    {
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader input = new BufferedReader(in);
        System.out.print("Enter the String : ");
        String str = input.readLine();
        //converting it to upper case 
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)>=97 && str.charAt(i)<=122)
            {
                str = str.replace(str.charAt(i),(char)(str.charAt(i)-32));
            }
        }
        System.out.println("Statement in Upper case : "+str);
    }    
}
