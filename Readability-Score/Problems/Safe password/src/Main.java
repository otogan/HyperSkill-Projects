import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String regex = "((?=.*[A-Z])(?=.*[a-z])(?=.*\\d).{12,})";
        String pass = scanner.nextLine();
        System.out.println(pass.matches(regex) ? "YES" : "NO");
    }
}