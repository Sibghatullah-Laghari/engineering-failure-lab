public class Experiment {
    static class User {
        String name;

        User(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        // Observable behavior: two references can point to the same object (aliasing).
        User a = new User("Initial");
        User b = a;
        b.name = "Updated via b";

        System.out.println("a.name = " + a.name);
        System.out.println("b.name = " + b.name);
        System.out.println("Same object? " + (a == b));
    }
}
