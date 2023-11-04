
package interface1;

public interface StudentInterface {
		int a=10;//public static final int a=10
		
		void showname(String name);//public abstract void showname
		void showage(int age);
		
                default void course() {
			System.out.println("Default Method of interface");
			System.out.println("Private non Static method."+ exam());
		}
		 static void Institute () {
			 System.out.println("Static Method of interface");
			 System.out.println("Private Static method ."+ city());
		 }
		 
		private String exam() {
			 return "CET";
		 }
		 
		 private static String city() {
			 return "Nagpur";
		 }
}

