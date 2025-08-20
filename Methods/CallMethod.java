package Methods;

public class CallMethod {

    static void myMethod() {
        System.out.println("I just got executed!");
    }

      // Create a checkAge() method with an integer variable called age
  static void checkAge(int age) {

    // If age is less than 18, print "access denied"
    if (age < 18) {
      System.out.println("Access denied - You are not old enough!");

    // If age is greater than, or equal to, 18, print "access granted"
    } else {
      System.out.println("Access granted - You are old enough!");
    }

  }

  static int myMethodRet(int x) {
    return 5 + x;
  }

  static int sum(int x, int y) {
    return x + y;
  }
    
    public static void main(String[] args) {
        myMethod();
        checkAge(20); // Call the checkAge method and pass along an age of 20
        System.out.println(myMethodRet(4));
        System.out.println(sum(5, 4));
        int z = sum(5, 4);
    System.out.println(z);
    }
    
    
    // Outputs "I just got executed!"
    
}
