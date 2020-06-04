import java.util.*;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Deque<Integer> stack = new ArrayDeque<>();
        TreeMap<Integer, Integer> map = new TreeMap<>();
        Integer one = 1;
        while (n > 0) {
            n--;
            String command = scanner.next();
            switch (command) {
                case "push":
                    Integer next = scanner.nextInt();
                    stack.offerLast(next);
                    map.put(next, map.getOrDefault(next, 0) + 1);
                    break;
                case "pop":
                    Integer last = stack.pollLast();
                    if (map.get(last).equals(one)) {
                        map.remove(last);
                    } else {
                        map.put(last, map.get(last) - 1);
                    }
                    break;
                case "max":
                    System.out.println(map.lastKey());
                    break;
            }
        }
    }
}
