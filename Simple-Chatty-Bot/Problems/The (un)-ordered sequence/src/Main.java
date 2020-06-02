import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int direction = 0;
        boolean ordered = true;
        int p = scanner.nextInt();
        int n = scanner.nextInt();
        while (n > 0) {
            if (n > p) {
                if (direction == 0) {
                    direction = 1;
                } else if (direction < 0) {
                    ordered = false;
                    break;
                }
            } else if (n < p) {
                if (direction == 0) {
                    direction = -1;
                } else if (direction > 0) {
                    ordered = false;
                    break;
                }
            }
            p = n;
            n = scanner.nextInt();
        }
        System.out.println(ordered);
    }
}
