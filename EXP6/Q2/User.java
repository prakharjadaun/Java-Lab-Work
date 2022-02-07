package EXP6.Q2;

//importing Scanner class for input and output 
import java.util.Scanner;

import EXP6.Q2.Balance.Account;
public class User 
{
    public static void main(String[] args)
    {
        //creating an object of the Scanner class
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the balance of the user : ");
        double bal = in.nextDouble();

        //creating an object of the imported class Account of package Balance
        Account user1 = new Account(bal);
        //displaying the balance of the user 
        user1.Display_Balance();
        in.close();
    }
}
