import java.util.Scanner;
class Circle
{
    public static void main(String args[])
    {
        int r;
        float area;
        Scanner sc=new Scanner(System.in);
        r=sc.nextInt();
        area=(float)(3.14)*(r)*(r);
        System.out.format("%.2f",area);
        sc.close();
    }
}