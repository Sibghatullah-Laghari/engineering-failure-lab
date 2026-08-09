public class Experiment {
    public static void main(String[] args) {
        // Observable behavior: repeated execution often becomes faster after warm-up.
        long start = System.nanoTime();
        long sum = 0;
        for (int i = 0; i < 5_000_000; i++) {
            sum += hotMethod(i);
        }
        long elapsedNs = System.nanoTime() - start;
        System.out.println("sum=" + sum + ", elapsedMs=" + (elapsedNs / 1_000_000));
    }

    static int hotMethod(int x) {
        return x * 31;
    }
}
