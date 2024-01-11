import java.util.Scanner;

public class Prog3 {
    public static void main(String[] args) {
        String[] numberNames = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number between 0 and 9: ");
        int number = scanner.nextInt();
        if (number >= 0 && number <= 9) {
            System.out.println("The number name is " + numberNames[number]);
        } else {
            System.out.println("Invalid input. Please enter a number between 0 and 9.");
        }
    }
}