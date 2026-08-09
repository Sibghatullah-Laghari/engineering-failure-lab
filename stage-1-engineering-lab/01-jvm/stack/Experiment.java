public class Experiment {
    public static void main(String[] args) {
        // Observable behavior: repeated self-calls consume stack frames until StackOverflowError.
        try {
            recurse(0);
        } catch (StackOverflowError e) {
            System.out.println("Observed: StackOverflowError after deep recursion");
        }
    }

    static void recurse(int depth) {
        if (depth % 1000 == 0) {
            System.out.println("Depth: " + depth);
        }
        recurse(depth + 1);
    }
}
