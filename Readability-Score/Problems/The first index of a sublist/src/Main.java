import java.util.*;
import java.util.stream.Collectors;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        List<Integer> list1 = stringToIntList(scanner.nextLine());
        List<Integer> list2 = stringToIntList(scanner.nextLine());
        System.out.println(
                Collections.indexOfSubList(list1, list2) +
                " " +
                Collections.lastIndexOfSubList(list1, list2));
    }

    private static List<Integer> stringToIntList(String s) {
        return Arrays.stream(s.split(" "))
                .mapToInt(Integer::parseInt)
                .boxed()
                .collect(Collectors.toList());
    }

}