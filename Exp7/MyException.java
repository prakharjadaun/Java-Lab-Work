package EXP7;
//user defined exception or custom exceptions
class MyException extends Exception //1. Exception extend karo
{
    private int a;
    MyException(int a)
    {
        this.a=a;
    }
    @Override
    public String toString()
    {
        return "User Exception Generated.....!\nNumber "+this.a+" is smaller than 500!";
    }
}
