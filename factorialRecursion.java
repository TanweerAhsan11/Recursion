import java.util.*;
public class factorialRecursion {

    static int FactorialRecursive(int num)
    {
        if(num==0)              // base case.
        {
            return 1;
        }
        return num*FactorialRecursive(num-1);
    }
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        int c=FactorialRecursive(num);
        System.out.print(c + " ");
    }
}
