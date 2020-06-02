import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        var n = scanner.nextInt();

        if (n < 1) {
            System.out.println("no army");
        } else if (n < 20) {
            System.out.println("pack");
        } else if (n < 250) {
            System.out.println("throng");
        } else if (n < 1000) {
            System.out.println("zounds");
        } else {
            System.out.println("legion");
        }
    }
}
