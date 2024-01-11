import java.util.Scanner;

public class Prog4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of units of water consumed: ");
        int units = sc.nextInt();
        double bill = 0;
        if (units <= 100) {
            bill = units * 2.00;
        } else if (units <= 300) {
            bill = 100 * 2.00 + (units - 100) * 3.00;
        } else if (units > 300) {
            bill = 100 * 2.00 + 200 * 3.00 + (units - 300) * 5.00;
            bill += bill * 0.025;
        }
        System.out.println("The total charge to be paid is Rs " + bill);
    }
}
