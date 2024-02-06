package Feb_05_Assignment2;
import java.awt.*;
import java.util.Scanner;
public class Q4_Remove_X
{
    public static String removeX(String s ,int i,char x , String g)
    {
       if(s.length()>i)
       {
           if(s.charAt(i) != 'x')
           {
               g = g + s.charAt(i) + removeX(s , i+1 , x ,g);
           }else{
             g=   removeX(s , i+1 , x ,g);
           }
       }
return g;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string");
        String str = sc.next();
        int i=0 ;
        String g = "";
        char c='x' ;
        System.out.println(removeX(str ,0 , 'x' , ""));
    }
}
