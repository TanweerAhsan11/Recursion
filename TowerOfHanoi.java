import java.util.Scanner;
public class TowerOfHanoi {
    public static void TOH(int n,char a,char b,char c)
    {
        if(n==1)
        {
            System.out.println("Move 1 from " + a + " to " + c);
            return;
        }
        TOH(n-1,a,c,b);
        System.out.println("Move " + n + " from " + a + " to " + c );
        TOH(n-1,b,a,c);
    }
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        char a='A';
        char b='B';
        char c='C';
        TOH(n,a,b,c);

    }
}
// T(n) = 2T(n-1) + 1       O(2^n)
// Number of steps = 2^n - 1
