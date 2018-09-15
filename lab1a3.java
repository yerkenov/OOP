import java.util.Scanner;
import java.lang.Math;
 
 
public class Lab1b {
    public static void main(String args[]){
 
        Scanner input = new Scanner(System.in);
        int x,y;
        //int res;
        x = input.nextInt();
        y = input.nextInt();
 
        for(int i = x; i <= y; i++){
            if(i % 2 == 0){
                System.out.print(i+" ");
            }
        }
    }
}
