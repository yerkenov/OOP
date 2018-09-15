
import java.util.Scanner;
//import java.lang.Math;
public class lab1a {
    public static void main( String args[] )
    {
        Scanner input = new Scanner(System.in);
 
        int n1;
        int n2;
        double res;
 
        n1 = input.nextInt();
        n2 = input.nextInt();
        n1 = n1*n1;
        n2 = n2*n2;
 
        res = Math.sqrt(n1 + n2);
        System.out.println(res);
    }
}
 
