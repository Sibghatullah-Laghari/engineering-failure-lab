import java.util.ArrayList;
import java.util.List;

public class Experiment {
    public static void main(String[] args) {
        // Observable behavior: a growing collection increases heap usage over time.
        List<byte[]> retained = new ArrayList<>();
        for (int i = 1; i <= 50; i++) {
            retained.add(new byte[1024 * 1024]); // 1 MB retained each iteration
            System.out.println("Retained MB: " + i);
        }
        System.out.println("Done. Collection size: " + retained.size());
    }
}
