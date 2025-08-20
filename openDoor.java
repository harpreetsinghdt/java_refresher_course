public class openDoor {
    public static void main(String[] args){
        int doorCode = 1337;
        if (doorCode == 1337) {
        System.out.println("Correct code. The door is now open.");
        } else {
        System.out.println("Wrong code. The door remains closed.");
        }

        int myNum = 10; // Is this a positive or negative number?

        if (myNum > 0) {
        System.out.println("The value is a positive number.");
        } else if (myNum < 0) {
        System.out.println("The value is a negative number.");
        } else {
        System.out.println("The value is 0.");
        }

        int myAge = 25;
        int votingAge = 18;

        if (myAge >= votingAge) {
        System.out.println("Old enough to vote!");
        } else {
        System.out.println("Not old enough to vote.");
        }

        int myNumIs = 5;

        if (myNumIs % 2 == 0) {
        System.out.println(myNumIs + " is even");
        } else {
        System.out.println(myNumIs + " is odd");
        } 
    }
    
}
