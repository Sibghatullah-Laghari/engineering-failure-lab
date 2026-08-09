public class Experiment {
    public static void main(String[] args) {
        // Observable behavior: many short-lived objects increase allocation pressure.
        for (int round = 1; round <= 20; round++) {
            for (int i = 0; i < 100_000; i++) {
                String temp = "obj-" + i + "-" + round; // short-lived allocation
            }
            System.out.println("Round completed: " + round);
        }
        System.out.println("Observe GC activity with JVM GC logging options.");
    }
}
