
package inheritance;
class Animal{
    void animalsound(){
        System.out.println(" Generic animal sound");
    }
}
class Dog{
    void animalsound(){
        System.out.println(" Dog barks");
    }
}
class Cat{
    void animalsound(){
        System.out.println(" cat mooouu");
    }
}

public class Override {
    public static void main(String[] args) {
           // type 1
           Animal a=new Animal();                                     
           a.animalsound();
           
           Dog d=new Dog();
        d.animalsound();
          
          Cat c=new Cat();
           c.animalsound();
    }
   
    
}
