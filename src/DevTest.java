import java.util.Scanner;

public class DevTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String name = safeInput.getNonZeroLenString(in, "Enter your name");
        System.out.println("You entered: " + name);

        int age = safeInput.getInt(in, "Enter your age");
        System.out.println("You entered: " + age);

        double salary = safeInput.getDouble(in, "Enter your salary");
        System.out.println("You entered: " + salary);

        int favoriteNumber = safeInput.getRangedInt(in, "Enter a number between 1 and 10", 1, 10);
        System.out.println("You entered: " + favoriteNumber);

        boolean confirm = safeInput.getYNConfirm(in, "Would you like to continue?");
        System.out.println("You have chosen: " + (confirm ? "Yes" : "No"));

        String email = safeInput.getRegExString(in, "Enter a valid email", "^[\\w._%+-]+@[\\w.-]+\\.[a-zA-Z]{2,}$");
        System.out.println("You have entered a valid email: " + email);

        double weight = safeInput.getRangedDouble(in, "Enter your weight", 30.0, 150.0);
        System.out.println("Your weight is: " + weight);

        System.out.println("Testing p method with different inputs:");
        PrettyHeader.printHeader("Welcome!");
    }
}


