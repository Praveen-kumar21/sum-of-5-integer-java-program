import java.util.Scanner;

public class Main
{
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 5 integers");
        long sum = 0, prod = 1;
        for (int i = 0; i < 5; i++) {
            int n = in.nextInt();
            sum += n;
        }
        
        String s = Long.toString(sum);
         long r = Long.parseLong(s);
        
        System.out.println("sum of number is = " + r);
    }
}