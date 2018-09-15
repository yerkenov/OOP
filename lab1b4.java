import java.util.Scanner;

public class lab1b4 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        int i = 1;
        while(i <= n){
            i++;
            if(n % i == 0) {
                System.out.print(i);
                break;
            }
        }
    }
}