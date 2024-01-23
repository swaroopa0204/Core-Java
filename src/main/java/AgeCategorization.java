import java.util.Scanner;

public class AgeCategorization {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int personAge = scanner.nextInt();
        if (personAge < 13) {
            System.out.println("Kid");
        } else if (personAge >= 13 && personAge <= 19) {
            System.out.println("Teen");
        } else {
            System.out.println("Adult");
        }
        scanner.close();
    }
}
