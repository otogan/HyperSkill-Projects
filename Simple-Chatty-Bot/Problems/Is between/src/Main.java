import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        var a = scanner.nextInt();
        var b = scanner.nextInt();
        var c = scanner.nextInt();
        System.out.println(b <= a && a <= c || c <= a && a <= b);
    }
}