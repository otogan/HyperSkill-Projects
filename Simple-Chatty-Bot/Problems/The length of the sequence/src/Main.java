import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        while (scanner.hasNext()) {
            int a = scanner.nextInt();
            if (a == 0) break;
            n++;
        }
        System.out.println(n);
    }
}
