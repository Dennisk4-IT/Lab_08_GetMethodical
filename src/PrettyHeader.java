public class PrettyHeader {
    public static void printHeader(String msg) {
        final int WIDTH = 60;
        int msgLength = msg.length();
        int sideOfStars = (WIDTH - msgLength - 6) / 2;

        System.out.println("*".repeat(WIDTH));

        String messageFormat = "*".repeat(sideOfStars) + " " + msg + " " + "*".repeat(sideOfStars);
        if (messageFormat.length() < WIDTH - 2) {
            messageFormat += "*";
        }
        System.out.println("* " + messageFormat + " *");

        System.out.println("*".repeat(WIDTH));
    }
}

