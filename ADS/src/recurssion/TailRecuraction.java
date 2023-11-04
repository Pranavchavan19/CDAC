package recurssion;

public class TailRecuraction {

    public static void tailRecuraction(String str) {

        if (str.length() == 0) {// base statement
            return;
        }

        System.out.println(str.charAt(0));
        tailRecuraction(str.substring(1));

    }

    public static void headRecuraction(String str1) {

        if (str1.length() == 0) {
            return;
        }

        headRecuraction(str1.substring(1));

        System.out.println(str1.charAt(0));

    }

    public static void main(String[] args) {
        System.out.println("recuresion of tail---->");
        tailRecuraction("anup");
        System.out.println("*****************************************************************");
        System.out.println("recuresion of head---->");
        headRecuraction("Ramesh");

    }
}
