public class CtoFTableDisplay {
    public static void main(String[] args) {
        System.out.println("Celsius | Fahrenheit");
        System.out.println("-------------------");

        for (int celsius = 0; celsius <= 100; celsius += 5) {
            double fahrenheit = (celsius * 9.0 / 5.0) + 32;
            System.out.printf("%3d     %.2f%n", celsius, fahrenheit);
        }
    }
}
