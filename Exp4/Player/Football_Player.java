package Exp4.Player;



public class Football_Player extends Player
{
    int NumOfGoals;
    String NameOfClub;
    String position;
    
    Football_Player(String n, float w, int h,int numGoals, String ClubName,String pos)
    {
        super(n,w,h);
        this.Sports="Football";
        this.NumOfGoals=numGoals;
        this.NameOfClub=ClubName;
        this.position=pos;
    }

    void printPlayerDetails()
    {
        super.printPlayerDetails();
        System.out.println("Number of goals scored : "+this.NumOfGoals);
        System.out.println("Name of the club : "+this.NameOfClub);
        System.out.println("Position the player plays at : "+this.position);
    }
}
