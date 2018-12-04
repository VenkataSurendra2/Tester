package testt;

public class Testdog {

	public static void main(String args[]) {
	      Animal b = new Dog(); // Animal reference but Dog object
	      
	     Dog d = new Dog();
	     d.move();
	      b.move();   // runs the method in Dog class
	   }

}