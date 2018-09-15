
import java.util.Scanner;
import java.lang.Math;
 
 
public class Lab1k3 {
    public static void main(String args[]){
 
        Scanner input = new Scanner(System.in);
        int n,k;
        int s = 0;
        n = input.nextInt();
        for(int i = 1; i <= n; i++){
            k = input.nextInt();
            s += k;
        }
        System.out.println(s);
 
    }
}
