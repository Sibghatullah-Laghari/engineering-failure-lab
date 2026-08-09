public class Experiment {
    public static void main(String[] args) {
        // Observable behavior: dynamic loading fails with ClassNotFoundException when class is absent.
        try {
            Class.forName("com.example.MissingClass");
        } catch (ClassNotFoundException e) {
            System.out.println("Observed: " + e.getClass().getSimpleName());
        }
    }
}
