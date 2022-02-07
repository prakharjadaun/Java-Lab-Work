package Exp4.Player;

public class Hockey_Player extends Player
{
    int Totalgoals;
    String TeamName;
    String position;

    Hockey_Player(String n, float w, int h,int goals, String tName, String pos)
    {
        super(n,w,h);
        this.Sports="Hockey";
        this.Totalgoals=goals;
        this.TeamName=tName;
        this.position=pos;
    }

    void printPlayerDetails()
    {
        super.printPlayerDetails();
        System.out.println("Number of goals scored : "+this.Totalgoals);
        System.out.println("Name of the team : "+this.TeamName);
        System.out.println("Position of the player : "+this.position);
    }

}
