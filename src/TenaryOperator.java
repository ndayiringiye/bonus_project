
import java.util.Scanner;

public class TenaryOperator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int kg;
        String result;
        System.err.print("Enter weight in kilograms:");
        kg = scanner.nextInt();
        result = (kg <= 50) ? "Light" : (kg <= 100) ? "moderate" : "Heavy";

        System.out.printf("the weight in kilograms is: %s \n", result);
    }
}
