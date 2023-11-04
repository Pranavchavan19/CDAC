package InnerClass;
	class ParentOfAnnonymous{
	void greeting() {
		System.out.println("Say hello");
	}
	}
	class OuterofAnnonymous{
		ParentOfAnnonymous p= new ParentOfAnnonymous () { // anonomyous class
			@Override
			void greeting() {
			System.out.println("Namaste ji..!!!");	
			}
		};// anonomyous class
	}
public class Test_Annonymous {
	public static void main(String [] arg) {
		OuterofAnnonymous o= new OuterofAnnonymous();
		o.p.greeting();
		
	}
}

//package InnerClass;

//class ParentOfAnnonymous {
//    void greeting() {
//        System.out.println("Say hello");
//    }
//}
//
//class OuterofAnnonymous {
//    ParentOfAnnonymous p = new ParentOfAnnonymous() { // anonymous class
//        @Override
//        void greeting() {
//            System.out.println("Namaste ji..!!!");
//        }
//    }; // anonymous class
//}
//
//public class Test_Annonymous {
//    public static void main(String[] arg) {
//        OuterofAnnonymous o = new OuterofAnnonymous();
//        o.p.greeting();
//    }
//}
