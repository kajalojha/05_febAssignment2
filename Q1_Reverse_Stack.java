package Feb_05_Assignment2;
import java.util.Scanner;
public class Q1_Reverse_Stack
{
    public static void reverse(int n )
    {
        if(n==0){
            return;
        }
        System.out.println(n);
        reverse(n-1);
    }
    public static void main(String[] args) {
      int n=5;
      reverse(n);


    }
}
