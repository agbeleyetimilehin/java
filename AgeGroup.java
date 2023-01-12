import java.util.Scanner;

public class AgeGroup {
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);
        double age;

        System.out.println("Enter any age to know the group");
        age = scanner.nextDouble();

        if (age <= 2) {
            System.out.println("Infant");
        } else if (age <= 12) {
            System.out.println("Child");
        } else if (age <= 19) {
            System.out.println("Teenager");
        } else if (age >= 20) {
            System.out.println("Adult");
        }
    }
}
