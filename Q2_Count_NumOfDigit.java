package Feb_05_Assignment2;

import java.util.Scanner;

public class Q2_Count_NumOfDigit
{
    public static int countDigit(int n)
    {
        if(n==0)
        {
            return 0;
        }
        return  countDigit(n/10)+1;


    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the num");
       int num =  sc.nextInt();
       int ans = countDigit(num);
        System.out.println(ans);

    }
}
