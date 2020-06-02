import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        var a = scanner.nextInt();
        var b = scanner.nextInt();
        var h = scanner.nextInt();

        System.out.println(h < a ? "Deficiency" : h > b ? "Excess" : "Normal");
    }
}
