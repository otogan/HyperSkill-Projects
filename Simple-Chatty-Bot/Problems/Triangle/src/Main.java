import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        var a = scanner.nextInt();
        var b = scanner.nextInt();
        var c = scanner.nextInt();
        System.out.println(
                a + b > c &&
                a + c > b &&
                b + c > a
                ? "YES" : "NO"
                );
    }
}
