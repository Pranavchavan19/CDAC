package Assignment_weekly_java;

class modifier {

    public int a = 10;

    public void show() {
        System.out.println("public method");

    }
    int a3 = 30;

    void show3() {
        System.out.println("Default method");

    }

    protected int a1 = 20;

    protected void show1() {

        System.out.println("protected method");
    }



 
}

public class Q_6_type_II {
   
  private int d = 8;
    private void did() {
     System.out.println("private Method");
    }
  

    public static void main(String[] args) {
        modifier obj = new modifier();
        obj.show();
        System.out.println("public variable=" + obj.a);
        System.out.println("*****************************************************************");
        obj.show1();
        System.out.println("protected variable=" + obj.a1);
        System.out.println("*****************************************************************");
        System.out.println("default variable=" + obj.a3);
        obj.show3();
        System.out.println("*****************************************************************");
        System.out.println("We cannot print private variable and method outside class");
        Q_6_type_II j=new Q_6_type_II();
        System.out.println("private variable="+j.d);
        j.did();
         


    }

    }
