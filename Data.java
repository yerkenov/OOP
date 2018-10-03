import java.util.Scanner;

public class Data {
    Data() {}
    private double average;
    private double Max = ;
    private int cnt;
    public void maxData(double m){
    	if(m>=maxData){
    		double m= maxData;
    	}
    }
    public void maxData(){
    	return maxData;
    }

    public void counter(double m){
        cnt++;
        average+=m;
    }
    public double averageData(){
        average=average/cnt;
        return average;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Data d= new Data();
        String s= sc.next();
        if(s.equals("Q")){
            System.out.println("Average = 0.0");
            System.out.println("Maximum = 0.0");
        }
        d.maxData();
        while(!s.equals("Q")){
            d.setMax(Double.parseDouble(s));
            d.counter(Double.parseDouble(s));
            s=sc.next();
        }
        System.out.println("Average = "+d.averageData());
        System.out.println("Maximum = "+d.maxData());
    }
}
