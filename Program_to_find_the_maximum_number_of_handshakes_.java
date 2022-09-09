import java.util.Scanner;
class Average
{
    public static void main(String args[])
    {
        int n,total;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        total=(n*(n-1))/2;
        System.out.println(total);
        sc.close();
    }
}