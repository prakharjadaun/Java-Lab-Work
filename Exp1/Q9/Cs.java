package Exp1.Q9;

class Cs
{
    public static void main(String args[])
    {
        Student s1=new Student();
        Student s2=new Student();
        String name1,name2,city1,city2;
        int age1,age2;
        name1=args[0];
        city1=args[1];
        age1=Integer.parseInt(args[2]);
        name2=args[3];
        city2=args[4];
        age2=Integer.parseInt(args[5]);
	    s2.getData(name2,city2,age2);
	    s2.printData();
	    s1.getData(name1,city1,age1);
	    s1.printData();
    }
}

