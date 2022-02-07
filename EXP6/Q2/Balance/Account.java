package EXP6.Q2.Balance;

public class Account 
{
    double balance;
    //constructor
    public Account(double bal)
    {
        this.balance=bal;
    }
    public void Display_Balance()
    {
        System.out.println("The Available Balance : "+this.balance);
    }    
}
