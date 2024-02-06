package Feb_05_Assignment2;
import java.util.Scanner;
public class Q5_RemoveDuplicate
{
    public static String removeDuplicate(String s  )
    {
       if(s.length()==1){
           return s;
       }
       if(s.charAt(0)==s.charAt(1)){
           return removeDuplicate(s.substring(1));
       }else{
           return s.charAt(0) + removeDuplicate(s.substring(1));
       }

    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the String ");
        String s = sc.next();
        String g = "";
        int i =s.length();
        System.out.println( removeDuplicate(s ));

    }
}
