import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        var n = scanner.nextInt();
        int a = 0, b = 0, c = 0, d = 0;
        while (n-- > 0) {
            var g = scanner.nextInt();
            switch (g) {
                case 5: a++; break;
                case 4: b++; break;
                case 3: c++; break;
                case 2: d++; break;
            }
        }
        System.out.println(d + " " + c + " " + b + " " + a);
    }
}
