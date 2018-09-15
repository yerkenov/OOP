import java.util.Scanner;
import java.lang.Math;
 
 
public class Lab1g5 {
 
    public static void main(String args[]){
 
        Scanner input = new Scanner(System.in);
        int n;
       // int cnt = 0;
        n = input.nextInt();
        int k[ ] = new int [n];
        int m[ ] = new int [n];
 
        for(int i = 0; i < n; i++){
           k[i] = input.nextInt();
        }
        for(int i = 0; i < n; i++){
            m[i] = k[n-i-1];
            System.out.print(m[i] + " ");
 
       
        }
 
    }
}
 
