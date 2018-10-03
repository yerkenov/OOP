import java.util.Scanner;

public class ArrayRepeat {
    public static int[] repeat(int[] a){
        int[] b = new int[a.length * 2];
        for(int i = 0; i < b.length; i++){
            b[i] =a [i/2];
        }
        return b;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr1 = new int[n];
        for(int j = 0; j < n; j++){
            arr1[j] = scanner.nextInt();
        }
        int[] arr2 = ArrayRepeat.repeat(arr1);
        for(int i = 0;i < arr2.length; i++){
            System.out.print(arr2[i] + " ");
        }
    }
}
