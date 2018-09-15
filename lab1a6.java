import java.util.Scanner;
import java.lang.Math;
 
public class lab1a6 {
    public static void main( String args[] )
    {
        Scanner input = new Scanner(System.in);
 
 int a = input.nextInt();
 int b = input.nextInt();
 int c = input.nextInt();
 int d = input.nextInt();
 int e = Math.min(a,b);
 int f = Math.min(c,d);
 
        System.out.println(Math.min(e,f));
    }
}
 