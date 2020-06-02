import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        int i = 0;
        while (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            if (i % 2 == 1) {
                list.add(n);
            }
            i++;
        }
        for (int j = list.size() - 1; j >= 0; j--) {
            System.out.print(list.get(j) + " ");
        }
    }
}