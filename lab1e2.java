import java.util.Scanner;
 
public class Lab1e2 {
    public static void main(String args[]){
 
        Scanner input = new Scanner(System.in);
        int x,y;
        //int res;
        x = input.nextInt();
        y = input.nextInt();
 
        if(x > y){
            System.out.println(1);
        }else if(x < y){
            System.out.println(2);
        }else if(x == y){
            System.out.println(0);
        }
        
    }
}
