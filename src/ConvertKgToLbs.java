import java.util.Scanner;

public class ConvertKgToLbs {

    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
    double kg;
    double lbs = 2.20462;
    double result;
    System.out.print("Enter weight in kilograms:");
    kg = scanner.nextDouble();

    result = kg *lbs;
    System.err.printf("the weight in kilograms is: %.2f kg \n", kg);
    System.err.printf("the weight in pounds is : %.2f lbs \n", result);

    }
}
