package Assignment_weekly_java;

public class Q_10_type_II {

    public static void main(String[] args) {
        int[] a = {2, 3, 4, 5};
        System.err.println("Elements present in Array=");
        for (int i = 0; i < a.length; i++) {
            System.err.println(a[i]);
        }
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        System.out.println("Sum of Ele=" + sum);
        float avg = sum / 5;
        System.out.println("Avg=" + avg);
        System.err.println("Min And Max Element Present in Array");
        int min = a[0];
        
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {

                if (a[i] > a[j]) {

                    min = a[i];

                } 

            }
        }
        int max = a[0];
        for (int i = 0; i <a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {

                if (a[i] > a[j]) {

                    max = a[i];

                } 
                if(a[i]>max)
                {
                   a[i]=max;
                }

            }
        }
        
        System.out.println(min);
        System.out.println(max);

    }

}
