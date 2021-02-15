public class MethodOverloading
{
    public static void main(String[] args)
    {
        MethodOverloading obj=new MethodOverloading();
        System.out.println(obj.add(5.0,5));
    }
    public int add(int no1,int no2)
    {
        System.out.println("2 int args::");
        int response=0;
        response=no1+no2;
        return response;
    }
    public double add(int no1,int no2,int no3)
    {
        System.out.println("3 int args::");
        double response=0;
        response=no1+no2+no3;
        return response;
    }
    public double add(double no1,double no2)
    {
        System.out.println("2 double args::");
        double response = no1 + no2;
        return response;
    }
    public double add(double no1,int no2)
    {
        System.out.println("double int args::");
        double response = no1 + no2;
        return response;
    }
}
