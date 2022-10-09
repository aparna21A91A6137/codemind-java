import java.util.Scanner;
import java.lang.Math;
class Minimum
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int m=sc.nextInt();
        int k,s;
        k=(int)Math.pow(x, y);
        s=k%m;
        System.out.print(s);
    }
}
