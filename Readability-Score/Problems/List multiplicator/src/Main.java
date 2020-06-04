import java.util.List;

/**
 * Class to modify
 */
class ListMultiplicator {

    /**
     * Multiplies original list provided number of times
     *
     * @param list list to multiply
     * @param n    times to multiply, should be zero or greater
     */
    public static void multiply(List<?> list, int n) {
        // Add implementation here
        multiplyCaptured(list, n);
    }

    private static <E> void multiplyCaptured(List<E> list, int n) {
        List<E> tmp = List.copyOf(list);
        list.clear();
        for (int i = 0; i < n; i++) {
            list.addAll(tmp);
        }
    }

}