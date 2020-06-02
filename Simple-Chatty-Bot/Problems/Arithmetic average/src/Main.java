import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        double sum = 0;
        int n = 0;
        while (a % 3 != 0) a++;
        while (a <= b) {
            sum += a;
            a += 3;
            n++;
        }
        System.out.println(n > 0 ? sum / n : 0);
    }
}

