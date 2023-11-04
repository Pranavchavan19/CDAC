
package packageDemo;

//import packageDemo.pack2.FirstDemo;

import packageDemo.pack2.FirstDemo;


//import packageDemopack1.SecondDemo;


//import packageDemo.pack2.FirstDemo;
//import packageDemo.pack2.FirstDemo;


//import packageDemo.pack2.FirstDemo;
//import packageDemo.pack2.SecondDemo;
//
//import packageDemo.pack2.*;
//import packageDemo.pack2.*;
//import packageDemopack1.*;




public class TestPackageDemo {
    public static void main(String[] args) {
       packageDemo.pack2.FirstDemo fd=new packageDemo.pack2.FirstDemo();// first way
                // FirstDemo fd1=new FirstDemo();
       packageDemopack1.FirstDemo fd1=new packageDemopack1.FirstDemo();
  //fd.x;  ithe public int nahi
  
//              fd.show();
//              fd1.show();
//              SecondDemo k=new SecondDemo();  // second way
//              k.show();
//
//                FirstDemo fd3= new FirstDemo();
//              
//                   fd3.show();
//                SecondDemo fd4=new  SecondDemo ();
//                fd4.show();
//              packageDemopack1.  FirstDemo h=new packageDemopack1.FirstDemo();
//               FirstDemo fd5= new FirstDemo();
//               fd5.show();
  
//           packageDemopack1.  SecondDemo  j=new packageDemopack1.SecondDemo();    
//       j.show();

//                   SecondDemo g=new SecondDemo();
//                   g.show();
         FirstDemo g= new FirstDemo();
         g.show();
         packageDemo.pack2.SecondDemo f=new packageDemo.pack2. SecondDemo();
         f.show();
        packageDemopack1. FirstDemo b=new packageDemopack1.FirstDemo();
        b.show();
        packageDemopack1.SecondDemo n=new packageDemopack1.SecondDemo();
        n.show();
    }
   
    
}
