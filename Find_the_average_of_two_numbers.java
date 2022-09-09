import java.util.Scanner;
class Average
{
    public static void main(String args[])
    {
        int a,b;
        float total;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        total=(float)(a+b)/2;
        System.out.format("%.4f",total);
        sc.close();
    }
}