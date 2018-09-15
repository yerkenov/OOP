
import java.util.Scanner; 
 
public class Lab1h3 {
    public static void main(String args[]){
 
        Scanner input = new Scanner(System.in);
        int a;
        a = input.nextInt();
        //b = input.nextInt();
        //c = input.nextInt();
        //d = input.nextInt();
 
        for(int i = 1; i <= a; i++){
            if(a%i == 0){
 
                System.out.println(i);
 
            }
        }
    }
}
 