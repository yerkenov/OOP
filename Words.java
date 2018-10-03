import java.util.Scanner;
import java.text.NumberFormat;

public class Words {

    public static String[] units = {"", "one", "two", "three", "four", "five",
                            "six", "seven", "eight", "nine", "ten", "eleven",
                            "twelve", "thirteen", "fourteen", "fifteen",
                            "sixteen", "seventeen", "eighteen", "nineteen"};
    public static String[] tens = { "", "ten", "twenty", "thirty", "forty", "fifty",
                            "sixty", "seventy", "eighty", "ninety"};

    public static String convert(int n) {
        if (n == 0) {
            return "zero";
        }

        if (n < 20) {
            return units[n];
        }

        if (n < 100) {
            return tens[n / 10] + ((n % 10 != 0) ? " " : "") + units[n % 10];
        }

        if (n < 1000) {
            if(n == 100) return "one hundred";
            return units[n / 100] + " hundred" + ((n % 100 != 0) ? " " : "") + convert(n % 100);
        }
        if(n == 1000) return "one thousand";
        return convert(n / 1000) + " thousand" + ((n % 10000 != 0) ? " " : "") + convert(n % 1000);


    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
		System.out.println(convert(n));

    }
}
