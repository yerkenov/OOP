import java.util.Scanner;
public class lab1b {
    public static void main(String args[]){
 
        Scanner input = new Scanner(System.in);
        int n1, n2, n3;
        n1 = input.nextInt();
        n2 = n1 + 1;
        n3 = n1 - 1;
        System.out.println("The next number for the number "+ n1 + " is " + n2 + ".");
        System.out.println("The previous number for the number "+ n1 + " is " + n3 + ".");
 
    }
}
 