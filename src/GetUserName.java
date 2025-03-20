import java.util.Scanner;

public class GetUserName {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String firstName = safeInput.getNonZeroLenString(in, "What is your first name");
        String lastName = safeInput.getNonZeroLenString(in, "What is your last name");

        System.out.println("Your full name is: " + firstName + " " + lastName);
    }
}
