import java.util.*;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        List<String> table = new ArrayList<>();
        int rows = scanner.nextInt();
        String cols = scanner.nextLine();
        while (rows > 0) {
            table.add(scanner.nextLine());
            rows--;
        }
        int n = scanner.nextInt();
        Collections.rotate(table, n);
        table.forEach(System.out::println);
    }
}