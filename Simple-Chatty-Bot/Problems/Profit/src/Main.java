import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        double m = scanner.nextInt();
        int p = scanner.nextInt();
        int k = scanner.nextInt();
        int y = 0;
        while (m < k) {
            m += m * p / 100;
            y++;
        }
        System.out.println(y);
    }
}
