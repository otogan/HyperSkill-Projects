import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        var x1 = scanner.nextInt();
        var y1 = scanner.nextInt();
        var x2 = scanner.nextInt();
        var y2 = scanner.nextInt();
        var xDif = Math.abs(x1 - x2);
        var yDif = Math.abs(y1 - y2);
        System.out.println((x1 == x2 || y1 == y2 || xDif == yDif) ? "YES" : "NO");
    }
}