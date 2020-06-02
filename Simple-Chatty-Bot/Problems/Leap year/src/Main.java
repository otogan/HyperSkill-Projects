import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        var n = scanner.nextInt();
        System.out.println(
                n % 4 == 0 && n % 100 != 0
                || n % 400 == 0
                ? "Leap" : "Regular"
        );
    }
}
