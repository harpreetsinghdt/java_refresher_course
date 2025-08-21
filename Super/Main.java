package Super;

/*
 * Access Parent Methods
If a subclass has a method with the same name as one in its parent class, 
you can use super to call the parent version:
 */
/*Call Parent Constructor
Use super() to call the constructor of the parent class. 
This is especially useful for reusing initialization code.
 */
class Animal {
    String type = "Animal";
    Animal() {
        System.out.println("Animal is created");
      }
    public void animalSound() {
      System.out.println("The animal makes a sound");
    }
  }
  
  class Dog extends Animal {
    String type = "Dog";
    Dog() {
        super(); // Call parent constructor
        System.out.println("Dog is created");
      }
    public void animalSound() {
      super.animalSound(); // Call the parent method
      System.out.println("The dog says: bow wow");
      /*Access Parent Attributes
You can also use super to access an attribute from the parent class 
if they have an attribute with the same name:
 */

    }
    public void printType() {
        System.out.println(super.type); // Access parent attribute
      }

      
  }
  
  public class Main {
    public static void main(String[] args) {
      Dog myDog = new Dog();
      myDog.animalSound();
      myDog.printType();
    }
  }
