package interface1;

public class Student implements StudentInterface {

	@Override
	public void showname(String name) {
		// TODO Auto-generated method stub
		System.out.println("My name is :" + name);
		
	}

	@Override
	public void showage(int age) {
		// TODO Auto-generated method stub
		System.out.println("My age is : "+age);
		
	}

}

