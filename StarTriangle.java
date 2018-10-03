import java.util.Scanner;

public class StarTriangle {
    public String star = "[*]";
    int width;
    public StarTriangle(int width){
        this.width = width;
    }
    public String toString()
    {
        String res = "";
        for(int i = 0; i < width; i++){
            for(int j = 0; j <= i; j++){
                res+=star;
            }
        res+="\n";
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of levels");
        StarTriangle starTriangle = new StarTriangle(scanner.nextInt());
        System.out.println(starTriangle.toString());
    }
}



