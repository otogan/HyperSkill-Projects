import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        int max = 0;
        while (i-- > 0) {
            int n = scanner.nextInt();
            if (n % 4 == 0 && n > max) max = n;
        }
        System.out.println(max);
    }
}
