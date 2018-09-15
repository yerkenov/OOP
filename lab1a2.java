import java.util.Scanner;
import java.lang.Math;
 
public class Lab1a2 {
    public static void main(String args[]){
 
        Scanner input = new Scanner(System.in);
        int n1;
        int n2;
        int res;
 
        n1 = input.nextInt();
        n2 = input.nextInt();
 
        res = Math.max(n1, n2);
 
        System.out.println(res);
    }
}
