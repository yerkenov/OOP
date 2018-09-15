
import java.util.Scanner;

public class Lab1g3 {
    public static void main(String args[]){
 
        Scanner input = new Scanner(System.in);
        int a;
        a = input.nextInt();
       
        for(int i = 2; i <= a; i++){
            if(a%i == 0){
 
                System.out.println(i);
                break;
             
            }
        }
    }
}
