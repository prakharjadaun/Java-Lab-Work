package Exp2;

class NumOfDays
{
    public static void main(String[] args)
    {
        
        int day0=1,month0=1,year0=1970;
        int day = Integer.parseInt(args[0]);
        int month=Integer.parseInt(args[1]);
        int year= Integer.parseInt(args[2]);
        int n1= 365*year + year/4 - year/100 + year/400 + day + (153*month+8)/5;
        int n2 =365*year0 + year0/4 - year0/100 + year0/400 + day0 + (153*month0+8)/5;
        System.out.println("Number of days between 01/01/1970 and "+day+"/"+month+"/"+year+" are : "+ (n1-n2));        
    }
}