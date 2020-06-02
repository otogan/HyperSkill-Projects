import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        var n = scanner.nextInt();
        var m = scanner.nextInt();
        var k = scanner.nextInt();
        System.out.println((k % n == 0 && k / n <= m ||
                k % m == 0 && k / m <= n) ? "YES" : "NO");
    }
}