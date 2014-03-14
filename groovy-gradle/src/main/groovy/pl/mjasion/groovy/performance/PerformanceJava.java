package pl.mjasion.groovy.performance;

public class PerformanceJava {
    public static void main(String[] args) {
        long totalLength = 0;
        PerformanceJava performanceJava = new PerformanceJava();
        int repeat = 10;
        for (int i = 0; i < repeat; i++) {
            totalLength += performanceJava.measure(40);
        }
        System.out.println("Java performance avg: " + (totalLength / repeat));
    }

    int fibDynamic(int i) {
        return i < 2 ? 1 : fibDynamic(i - 2) + fibDynamic(i - 1);
    }

    private long measure(int i) {
        long start = milis();
        fibDynamic(i);
        long length = calculateTheEnd(start);
        System.out.println("Java took: " + length);
        return length;
    }

    private long calculateTheEnd(long start) {
        return milis() - start;
    }

    private long milis() {
        return System.currentTimeMillis();
    }
}
