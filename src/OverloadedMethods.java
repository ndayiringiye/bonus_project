import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your favorite food: ");
        String myfood = scanner.nextLine();

        System.out.print("Enter the amount: ");
        int amount = scanner.nextInt();

        System.out.println(favorites(myfood, amount));
    }
    static String favorites(String myfood, int amount) {
        for (int i = 1; i <= myfood.length(); ++i) {
            System.out.println(i);
        }
        return "The holiday I spent with: " + myfood + " (" + amount + ")";
    }
}
