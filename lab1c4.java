import java.util.Scanner;

public class lab1c4 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        int i = 1;
        while(i <= n){
            System.out.print(i + " ");
            i *= 2;
        }
    }
}