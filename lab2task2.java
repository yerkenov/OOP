import java.lang.reflect.Array;

    public class lab2task2{
        int width;
        String symbol ="[*}";
        public StarTriangle(int width1){
            width = width1;
        }
        public String toString(){
            String str = "";
            for(int i = 0;i < width; i++){
                for(int j = 0;j <= i;j++){
                    str = str.concat(symbol);
                }
                str = str+'\n';
            }

            return str;
        }


    public static void main(String[] args) {

        StarTriangle s=new StarTriangle(3);
        System.out.print(s.toString());
    }
}