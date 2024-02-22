import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Enter the numerator:");
            float numerator = scanner.nextFloat();

            System.out.println("Enter the denominator:");
            float denominator = scanner.nextFloat();

            if (denominator == 0) {
                throw new ArithmeticException("Denominator cannot be zero");
            }

            float result = numerator / denominator;
            System.out.println("Result of division: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
