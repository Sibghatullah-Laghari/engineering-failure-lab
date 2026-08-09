public class Experiment {
    public static void main(String[] args) {
        // Observable behavior: compile and inspect bytecode with `javap -c Experiment`.
        int result = add(2, 3);
        System.out.println("add(2,3) = " + result);
    }

    static int add(int a, int b) {
        return a + b;
    }
}
