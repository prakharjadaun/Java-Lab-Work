package Exp10;
//2021-11-08-15-37-53.png

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Map.Entry; 

public class Q2 
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        Map<String,Integer> HM = new HashMap<>();
        
        //inserting the elements to the HashMap 
        HM.put("one",1);
        HM.put("two",2);
        HM.put("three",3);
        HM.put("four",4);
        HM.put("five",5);
        HM.put("one",1);
        System.out.println(HM);
        
        
        //find whether specified key exists or not.
        System.out.print("Enter the key you want to check in the Hash Map : ");
        String k = in.next();
        if(HM.containsKey(k))
        {
            System.out.println("HashMap contains '"+k+"' as a key");
        }
        else 
        {
            System.out.println("HashMap does not contains '"+k+"' as a key");
        }

        //find whether specified value exists or not
        System.out.print("Enter the val you want to check in the Hash Map : ");
        int val = in.nextInt();
        if(HM.containsValue(val))
        {
            System.out.println("HashMap contains '"+val+"' as a value");
        }
        else 
        {
            System.out.println("HashMap does not contains '"+val+"' as a value");
        }
        
        //get all the keys from the Hash Map 
        System.out.println("Keys of the Hash Map :"+HM.keySet());

        //get all key-value pair as Entry objects
        System.out.println("-- Key Value pairs as Entry Objects --");
        Set<Entry<String, Integer>> entries = HM.entrySet();
        //using for each loop
        for(Entry<String,Integer> e:entries){
            System.out.println(e.getKey()+" ==> "+e.getValue());
        }
        
        in.close();
    }    
}
