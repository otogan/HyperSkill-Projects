import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        var n = scanner.nextInt();
        if (n < 1000) n += 1001;
        int t = n;
        int m = 0;
        do {
            m *= 10;
            m += t % 10;
            t /= 10;
        } while (t > 0);
        System.out.println(n == m ? 1 : 0);
    }
}