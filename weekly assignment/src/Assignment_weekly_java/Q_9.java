package Assignment_weekly_java;

public class Q_9 {

    public static void main(String[] args) {

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j <= 6; j++) {
                if (j == 1 || ((i == 0 || i == 6 - 1) && (j > 1 && j < 6 - 2)) || (j == 6 - 2 && i != 0 && i != 6 - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
