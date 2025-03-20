import java.util.Scanner;

public class CheckOut {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double price = safeInput.getRangedDouble(in, "Enter the price of item", 1.0, 500.0);

        boolean continueShopping = safeInput.getYNConfirm(in, "Would you like to continue shopping?");

        System.out.println("The item price is: $" + price);
        System.out.println("You chose to " + (continueShopping ? "continue shopping." : "check out."));
    }
}
