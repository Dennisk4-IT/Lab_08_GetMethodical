import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String userName = safeInput.getNonZeroLenString(in, "Enter your name");
        int userAge = safeInput.getInt(in, "Enter your age");
        double userGPA = safeInput.getDouble(in, "Enter your GPA");
        boolean confirm = safeInput.getYNConfirm(in, "Do you want to proceed?");
        String zipCode = safeInput.getRegExString(in, "Enter your ZIP code (5 digits)", "^\\d{5}$");
        String headerMessage = safeInput.getNonZeroLenString(in, "Enter the message for the header");


        System.out.println("\nSummary:");
        System.out.println("Name: " + userName);
        System.out.println("Age: " + userAge);
        System.out.println("GPA: " + userGPA);
        System.out.println("Confirmed: " + (confirm ? "Yes" : "No"));
        System.out.println("ZIP Code: " + zipCode);
        PrettyHeader.printHeader(headerMessage);
    }
}

