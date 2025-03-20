import java.util.Scanner;

public class FavNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int favInt = safeInput.getInt(in, "Enter your favorite whole number");

        double favDouble = safeInput.getDouble(in, "Enter your favorite decimal number");

        System.out.println("Your favorite whole number is: " + favInt);
        System.out.println("Your favorite decimal number is: " + favDouble);
    }
}
