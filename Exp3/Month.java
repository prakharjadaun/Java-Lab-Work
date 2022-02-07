package Exp3;
import java.util.Scanner; 
public class Month 
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of a month : ");
        int n = in.nextInt();
        switch(n)
        {
            case 1 : 
                System.out.println("1 is for January");
                break;
            case 2 : 
                System.out.println("2 is for February");
                break;
            case 3 :
                System.out.println("3 is for March");
                break;
            case 4 :
                System.out.println("4 is for April");
                break;
            case 5 :
                System.out.println("5 is for May");
                break;
            case 6 :
                System.out.println("6 is for June");
                break;
            case 7 :
                System.out.println("7 is for July");
                break;
            case 8 :
                System.out.println("8 is for August");
                break;
            case 9 :
                System.out.println("9 is for September");
                break;
            case 10 :
                System.out.println("10 is for October");
                break;
            case 11 :
                System.out.println("11 is for November");
                break;
            case 12 :
                System.out.println("12 is for December");
                break;
            default :
                System.out.println("Invalid input....!");
                break;
        }
        in.close();
    }
}
