import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int n = scanner.nextInt();
        int i = 0;
        boolean crash = false;
        while (n-- > 0) {
            i++;
            if (crash = h >= scanner.nextInt()) break;
        }
        System.out.println(crash ? "Will crash on bridge " + i : "Will not crash");
    }
}
