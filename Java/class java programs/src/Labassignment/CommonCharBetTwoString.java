//package Labassignment;

public class CommonCharBetTwoString {

    public static void main(String[] args) {
        String s1 = "pranav";
        String s2="Raman";
//        int h=  s1.compareTo(s2);
//        System.out.println(h);
        // System.out.println(s1.compareTo(s2));
        char[] a = s1.toCharArray();
         char []b=s2.toCharArray();
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {  // Fix: changed i to j
                if (a[i] == b[j]) {
                    System.out.print(a[i]+" ");
                }
            }
        }
    }
}
