package Exp4.Player;

public class Player 
{
    String name;
    double weight;
    int height; 
    String Sports;

    public Player(String n, double d, int h)
    {
        this.name=n;
        this.weight=d;
        this.height=h;
        this.Sports="Not Assigned";
    }
    public void SetSports(String s)
    {
        this.Sports=s;
    }
    void printPlayerDetails()
    {
        System.out.println("Name of the player : "+this.name);
        System.out.println("Weight of the player : "+this.weight);
        System.out.println("Height of the player : "+this.height);
        System.out.println("Sports the player plays : "+this.Sports);
    }
}
