import java.util.*;
public class fibonacciRecursion {
    static int fibonacciRecursive(int num)
    {
        if(num<=1)
        {
            return 1;
        }
        return fibonacciRecursive(num-1) + fibonacciRecursive(num-2);
    }
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        int result = fibonacciRecursive(num);
        System.out.print(result + " ");
    }
}
