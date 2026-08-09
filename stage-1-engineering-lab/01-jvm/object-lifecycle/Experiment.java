public class Experiment {
    static class User {
        User() {
            System.out.println("Constructor executed");
        }
    }

    public static void main(String[] args) {
        // Observable behavior: object is allocated, initialized, and referenced by `user`.
        User user = new User();
        System.out.println("Reference assigned? " + (user != null));
    }
}
