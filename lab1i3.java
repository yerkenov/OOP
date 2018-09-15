import java.util.Scanner;
import java.lang.Math;
 
 
public class lab1i3{
    public static void main(String args[]){
 
        Scanner input = new Scanner(System.in);
        int a;
        int cnt = 0;
        a = input.nextInt();
       
        for(int i = 1; i <= Math.sqrt(a); i++){
            if(a % i == 0){
                //System.out.println(i);
                cnt++;
            }
 
        }
       
        System.out.println(cnt+cnt);
 
    }
}
