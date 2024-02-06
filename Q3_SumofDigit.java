package Feb_05_Assignment2;

import java.util.Scanner;

public class Q3_SumofDigit
{
    public static int sumOfDigit(int[] arr ,   int i)
    {
       if(i==arr.length)
       {
           return 0;
       }
    return  arr[i]+ sumOfDigit(arr ,i+1 ) ;

    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int n = sc.nextInt();
        //int arr[] = {1,2,3,4};
        int arr[] = new int[n];
        for(int i=0;i<n ;i++){
            arr[i] = sc.nextInt();
        }


        System.out.println(sumOfDigit(arr , 0));

    }
}
