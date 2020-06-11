import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String output = "NO";
        String ipAddress = scanner.nextLine().trim();
        if (ipAddress.matches("\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}")) {
            String[] parts = ipAddress.split("\\.");
            if (checkNumbers(parts, 0, 255)) {
                output = "YES";
            }
        }

        System.out.println(output);
    }

    private static boolean checkNumbers(String[] parts, int min, int max) {
        for (String part : parts) {
            try {
                int num = Integer.parseInt(part);
                if (num < min || max < num) {
                    return false;
                }
            } catch (NumberFormatException e) {
                return false;
            }
        }
        return true;
    }
}