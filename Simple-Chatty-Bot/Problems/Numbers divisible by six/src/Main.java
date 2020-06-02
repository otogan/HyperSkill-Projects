import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        int sum = 0;
        while (i-- > 0) {
            int n = scanner.nextInt();
            if (n % 6 == 0)
                sum += n;
        }
        System.out.println(sum);
    }
}

