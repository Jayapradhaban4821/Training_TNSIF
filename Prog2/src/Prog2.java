import java.util.Scanner;

public class Prog2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your string: ");
        String input = scanner.nextLine();
        int vowelsCount = 0, consonantsCount = 0;
        for (char c : input.toLowerCase().toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                if ("aeiou".indexOf(c) != -1) {
                    vowelsCount++;
                } else {
                    consonantsCount++;
                }
            }
        }
        System.out.println("Number of vowels: " + vowelsCount);
        System.out.println("Number of consonants: " + consonantsCount);
    }
}