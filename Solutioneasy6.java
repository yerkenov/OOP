import java.util.*;
import java.io.*;

class Solutioneasy6{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            for(int j = 0;j < n;j++){
                if(j == 0) a += (int)Math.pow(2,j)*b;
                else a += (int)Math.pow(2,j)*b;
                System.out.print(a + " ");
            }
            System.out.println();
        }
        in.close();
    }
}
