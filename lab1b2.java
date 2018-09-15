import java.util.Scanner;

public class Lab1b2 {
    public static void main(String args[]){
 
        Scanner input = new Scanner(System.in);
        int n;
        n = input.nextInt();
        String res;
        if(n % 4 == 0 && n % 100 != 0 || n % 400 == 0){
            res = "YES";
        }else{
            res = "NO";
        }
        System.out.println(res);
    }
}