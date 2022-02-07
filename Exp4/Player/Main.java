package Exp4.Player;

public class Main 
{
    public static void main(String[] args)
    {
        Player obj1 = new Player("Ronaldo",88.8,185);
        Cricket_Player obj2 = new Cricket_Player("Virat",78,178,1,10_000,11);
        Football_Player obj3 = new Football_Player("Messi",75,170,88,"PSG","Center Forward");
        Hockey_Player obj4 = new Hockey_Player("Amanpreet",80,179,57,"India","Defender");

        obj1.printPlayerDetails();  
        System.out.println();  
        obj2.printPlayerDetails();
        System.out.println();
        obj3.printPlayerDetails();
        System.out.println();
        obj4.printPlayerDetails();
    }    
}
