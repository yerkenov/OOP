import java.util.Scanner;
import java.lang.Math; 
 
public class Lab1m3 {
    public static void main(String args[]){
 
        Scanner input = new Scanner(System.in);
        int n;
        int k = 0;
        int s = 0;
        n = input.nextInt();
        for(int i = 1; i <= n; i++){
            k = input.nextInt();
            if(k == 0){
                s++;
            }
        }
        System.out.println(s);
 
    }
}