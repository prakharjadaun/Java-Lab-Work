package Exp4.Player;

public class Cricket_Player extends Player
{
    int ranking;
    int Totalruns;
    int totalWickets;
    Cricket_Player(String n, float w, int h,int ranking, int totalruns, int totalWickets)
    {
        super(n,w,h);
        this.Sports="Cricket";
        this.ranking=ranking;
        this.Totalruns=totalruns;
        this.totalWickets=totalWickets;
    }
    @Override
    void printPlayerDetails()
    {
        super.printPlayerDetails();
        System.out.println("Ranking : "+this.ranking);
        System.out.println("Total runs scored : "+this.Totalruns);
        System.out.println("Total wickets : "+this.totalWickets);
    }
}




