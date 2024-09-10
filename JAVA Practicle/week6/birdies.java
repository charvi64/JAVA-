package week6;

//Abstract class Bird with a method fly() that subclasses can override
abstract class Bird {
 public abstract void fly();
}

//FlyingBird class extending Bird
class FlyingBird extends Bird {
 @Override
 public void fly() {
     System.out.println("This bird is flying.");
 }
}

//Ostrich class implementing Bird as a non-flying bird
class Ostrich extends Bird {
 @Override
 public void fly() {
     System.out.println("Ostriches cannot fly!");
 }
}

public class birdies {
 public static void main(String[] args) {
     // Create instances and call the fly method
     Bird sparrow = new FlyingBird();
     Bird ostrich = new Ostrich();

     sparrow.fly(); // This bird is flying.
     ostrich.fly(); // Ostriches cannot fly!
 }
}
