import java.util.Scanner;
class Average
{
    public static void main(String args[])
    {
        int a,b;
        int total;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        total=a*b;
        System.out.println(total);
        sc.close();
    }
}