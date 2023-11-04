

package InnerClass;
/*interface ParentOfAnnonymous {
  public void greeting();
  //void show();

}
	
	class OuterofAnnonymous{
		ParentOfAnnonymous p= new ParentOfAnnonymous () { // anonomyous class
			@Override
			 public void greeting() {
			System.out.println("Namaste ji..!!!");	
			}

                  
                   
                        
		};// anonomyous class
	}
public class AnnanomousClassWithInterface 
 {
	public static void main(String [] arg) {
		OuterofAnnonymous o= new OuterofAnnonymous();
		o.p.greeting();
		
	}
}*/
interface ParentOfAnnonymous {
    void greeting();
}

class ChildOfAnnonymous implements ParentOfAnnonymous {
    @Override
  public void greeting() {
        System.out.println("Namaste ji..!!!");
    }
}

class OuterofAnnonymous {
    ParentOfAnnonymous p = new ChildOfAnnonymous(); // Creating an instance of the implementing class
}

public class AnnanomousClassWithInterface {
    public static void main(String[] args) {
        OuterofAnnonymous o = new OuterofAnnonymous();
        o.p.greeting();
    }
}




    
