package interface1;

public class TestInterface {
	public static void main(String args[]) {
		StudentInterface si;
		si=new Student();
		si.showage(23);
		si.showname("Kshitij");
		si.course();
		StudentInterface.Institute();
		
	}
}
