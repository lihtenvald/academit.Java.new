package academit;

public class LoopFor {
    public static void main(String[] args) {
        for (int i = 100; i >= 1; i--) {
            if (isMultipleOfFour(i)) {
                System.out.print(i + " ");
            }
        }
    }

    private static boolean isMultipleOfFour(int i) {
        return (i % 4 == 0);
    }
}