import java.util.Iterator;

class Range implements Iterable<Long> {

    private long fromInclusive;
    private long toExclusive;

    public Range(long from, long to) {
        this.fromInclusive = from;
        this.toExclusive = to;
    }

    @Override
    public Iterator<Long> iterator() {
        // write your code here
        return new Iterator<Long>() {
            private long from = fromInclusive;
            private long to = toExclusive;
            private long nextLong = from;

            @Override
            public boolean hasNext() {
                return nextLong < to;
            }

            @Override
            public Long next() {
                return nextLong++;
            }
        };
    }
}