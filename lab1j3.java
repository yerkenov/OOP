import java.util.Scanner;
public class Lab1j3 {
 
    public static void main(String args[]){
        Scanner input= new Scanner(System.in);
        int n;
        int s = 0;
        for(int i=0; i<100; i++){
            n = input.nextInt();
            s+=n;
        }
        System.out.println(s);
    }
}
