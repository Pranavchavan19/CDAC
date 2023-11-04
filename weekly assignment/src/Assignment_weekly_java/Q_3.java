/*3.Write a Java program to create an abstract class Instrument with abstract methods play() and
tune(). Create subclasses for Piano and Guitar that extend the Instrument class and implement
the respective methods to play and tune each instrument.*/


package Assignment_weekly_java;
abstract class Instrument
{
   abstract void tune();
   abstract void play();


}
class Piano extends Instrument
{

    @Override
    void tune() {
        System.out.println("Its soud is sweet");
    }

    @Override
    void play() {
        System.out.println("It is easy to handle");
    }

}
class Guitar  extends Instrument
{

    @Override
    void tune() {
        System.out.println("Its soud is   really sweet ");
    }

    @Override
    void play() {
        System.out.println("It is difficult to handle");
    }

}
public class Q_3 {
    public static void main(String[] args) {
      Instrument h;
              System.out.println("Description for Piano");

      h=new Piano();
      h.play();
      h.tune();
      
        System.out.println("*********************************************************************)");
                      System.out.println("Description for Guitar ");

        h= new Guitar();
        h.play();
        h.tune();
    }
    
}
