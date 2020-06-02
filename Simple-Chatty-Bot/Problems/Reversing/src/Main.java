import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        var n = scanner.nextInt();
        var m = 0;
        do {
            m *= 10;
            m += n % 10;
            n /= 10;
        } while (n > 0);
        System.out.println(m);
    }
}
