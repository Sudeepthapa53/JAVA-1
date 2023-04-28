public class Main {
    public static int Sum(int a, int b)
    {
        return (a+b);
    }
    public static int Sum(int a, int b, int c)
    {
        return (a+b+c);
    }
    public static int Sum(int a, int b, int c, int d)
    {
        return (a+b+c+d);
    }

    public static void main(String[] args){
        System.out.println("sum of two arguments is "+Sum(5,1));
        System.out.println("sum of three arguments is "+Sum(5,1,1));
        System.out.println("sum of four arguments is "+Sum(5,1,1,1));
    }
}