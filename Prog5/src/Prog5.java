import java.util.Scanner;

public class Prog5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of p: ");
        double p = sc.nextDouble();
        if (p < 2.5) {
            System.out.println("Invalid input. p cannot be smaller than 2.5.");
        } else {
            double sum = 0;
            for (double i = 2.5; i <= p; i += 2) {
                sum += i;
            }
            System.out.println("The sum of the series up to term " + p + " is " + sum);
        }
    }
}