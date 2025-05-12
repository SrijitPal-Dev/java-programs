
public class FlagPattern {

    public static void main(String[] args) {
        int rows = 15;
        int stars = 6;
        int dashes = 42;

        for (int i = 0; i < rows; i++) {
            // Print stars section
            if (i <= stars) {
                for (int j = 0; j < stars; j++) {
                    System.out.print("* ");
                }
                for (int j = 0; j < dashes; j++) {
                    System.out.print("=");
                }
            }
            if (i > stars) {
                for (int j = 0; j < dashes + 12; j++) {
                    System.out.print("=");
                }
            }

            System.out.println();
        }
    }
}
