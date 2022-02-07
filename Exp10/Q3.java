package Exp10;

import java.util.HashSet;
import java.util.ArrayList;
import java.util.Scanner; 
class Q3 
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        //creating a ArrayList 
        ArrayList<String> arr = new ArrayList<>();
        arr.add("Prakhar");
        arr.add("Laxman");
        arr.add("Ram");
        arr.add("Sita");
        arr.add("Laxman");
        arr.add("Prakhar");
        //displaying the elements of the ArrayList
        System.out.println("Array List : "+arr);

        //1. copying another collection(ArrayList) object to HashSet object.
        HashSet<String> obj = new HashSet<>(arr);
        //displaying the elements of the HashSet
        System.out.println("Hash Set : "+obj);

        //2. delete all entries at one call from HashSet
        obj.removeAll(obj);
        System.out.println("After removing all elements, Hash Set : "+obj);

        //3. search user defined objects from HashSet

        //adding some objects in the HashSet 
        obj.add("My");
        obj.add("name");
        obj.add("is");
        obj.add("Prakhar");
        obj.add("Jadaun");
        System.out.println("After adding some elements, HashSet : "+obj);
        System.out.print("Enter the object you want to search in the Hash Set : ");
        String ele = in.next();

        if(obj.contains(ele))
        {
            System.out.println("Hash Set contains '"+ele+"'");
        }
        else 
        {
            System.out.println("Hash Set do not contain '"+ele+"'");
        }

        in.close();
    }
}
