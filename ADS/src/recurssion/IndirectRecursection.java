package recurssion;

public class IndirectRecursection {

    static int i = 1;

    static void even(int n) {
        if (n > 10) {
            return;
        }
        System.out.println("even " + n);

        odd(++n);

    }

    static void odd(int n) {
        if (n > 10) {
            return;
        }

        System.out.println("odd " + n);
        even(++n);

    }

    public static void main(String[] args) {
        odd(i);

    }

}
