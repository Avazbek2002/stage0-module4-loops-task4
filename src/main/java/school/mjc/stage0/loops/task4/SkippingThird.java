package school.mjc.stage0.loops.task4;

public class SkippingThird {
    public void printUntilButThird(int lastPrinted) {
        for (int i = 1; (i <= lastPrinted) && (i % 3 != 0); i++) {
            System.out.println(i);
        }
    }
}
