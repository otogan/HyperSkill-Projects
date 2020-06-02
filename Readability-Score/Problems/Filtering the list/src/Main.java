import java.util.*;

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
        Collections.reverse(list);
        list.forEach(e -> System.out.print(e + " "));
    }
}