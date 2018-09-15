import java.util.Scanner;
import java.lang.Math;
 
public class lab1c6{
      static int Xxor(int x, int y){
        return x^y;
    }
    public static void main( String args[]){
    Scanner input = new Scanner(System.in);
    int a = input.nextInt();
    int b = input.nextInt();
 
  System.out.print(Xxor(a, b));
}}
