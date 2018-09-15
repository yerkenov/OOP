import java.util.Scanner;

public class Lab1c2 {
    public static void main(String args[]){
 
        Scanner input = new Scanner(System.in);
        int n, m;
        String res;
        n = input.nextInt();
        m = input.nextInt();
        if((n == 1 && m == 1) || (n !=1 && m != 1)){
            res = "YES";
        }else{
            res = "NO";
        }
        System.out.println(res);
    }
}
 