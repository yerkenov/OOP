
import java.util.Scanner;
 
public class lab1e {
    public static void main(String[] args) {
 
        Scanner cs=new Scanner(System.in);
        int a=cs.nextInt();
        int b=cs.nextInt();
        int s;
        if(a>0){
            s=(a*b)%109;
        }
        else {
            s=(109+(a*b)%109)%109;
 
        }
        System.out.print(s);
    }
}
