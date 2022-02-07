package Exp1.Q11;

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
    
    public void fb()
    {
        float temp =this.x;
        this.x=2*this.x;
        this.y = temp + this.y;
    }
    public void fc()
    {
        float temp = this.x;
        this.x=this.x+this.y;
        this.y=temp*this.y;
    }
    public void print()
    {
        System.out.println("x : "+this.x);
        System.out.println("y : "+this.y);
    }
}
