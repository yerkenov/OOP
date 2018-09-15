    public class lab2task5{
        public static int[] rep(int[] x){
            int[] y = new int[x.length * 2];
            for(int i = 0;i < y.length; i++){
                y[i] = x[i/2];
            }
            return y;
        }

    public static void main(String[] args) {
        int[] n = {1,2,3};
        int[] y = Array.rep(n);
        for(int i = 0;i < y.length; i++){
            System.out.print(y[i] + " ");
        }
    }
}