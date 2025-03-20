import java.util.Scanner;

public class BirthDateTime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int birthYear = safeInput.getRangedInt(in, "Enter your birth year", 1900, 2025);
        int birthMonth = safeInput.getRangedInt(in, "Enter your birth month", 1, 12);
        int birthDay = safeInput.getRangedInt(in, "Enter your birth day", 1, 31);

        System.out.println("Your birth date is: " + birthMonth + "/" + birthDay + "/" + birthYear);
    }
}
