import java.util.Scanner;

public class lab1d4 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        int i = 1;
        boolean ok = false;

        while(i <= n){
            if(n ==i){
                ok = true;
            }
            i *= 2;
        }

        if(ok){
            System.out.print("YES");
        }else{
            System.out.print("NO");
        }
    }
}