package Exp1.Q10;

class Point 
{
    private float x,y;
    public void getPoint(float a,float b)
    {   
        x=a;
        y=b;
    }
    public void fa()
    {
        this.x=this.x+this.y;
        this.y=this.y*2;
    }    
    public void print()
    {
        System.out.println("x : "+this.x);
        System.out.println("y : "+this.y);
    }
}

