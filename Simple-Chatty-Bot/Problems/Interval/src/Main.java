import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        var n = scanner.nextInt();
        System.out.println(
                n >= 19
                || 14 < n && n < 17
                || -15 < n && n <= 12
                ? "True" : "False"
        );
    }
}
