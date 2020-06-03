import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Queue<Integer> queue1 = new ArrayDeque<>();
        Queue<Integer> queue2 = new ArrayDeque<>();
        int q1Load = 0;
        int q2Load = 0;

        while (n > 0) {
            if (q1Load <= q2Load) {
                queue1.offer(scanner.nextInt());
                q1Load += scanner.nextInt();
            } else {
                queue2.offer(scanner.nextInt());
                q2Load += scanner.nextInt();
            }
            n--;
        }
        queue1.forEach(i -> System.out.print(i + " "));
        System.out.println();
        queue2.forEach(i -> System.out.print(i + " "));
    }
}