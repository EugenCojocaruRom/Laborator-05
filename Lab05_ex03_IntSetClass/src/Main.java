import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Open keyboard
        Scanner sc = new Scanner(System.in);
        //Display prompt
        System.out.print("Enter the number of elements in the set: ");
        //Declare variable of type int and read it from the keyboard
        int n = sc.nextInt();
        sc.nextLine();
        //Declare variable of type IntSet and set the number of its elements to n
        IntSet mySet = new IntSet(n);

        //1. Add elements
        addSetElements(n, mySet, sc);
        //2. Check elements
        setContainsElements(n, mySet, sc);
        //3. Remove elements
        removeSetElements(n, mySet, sc);

    }

    //Method for adding elements
    static void addSetElements(int n, IntSet mySet, Scanner sc) {
        //Declare variable of type int and initialize it
        int i = 0;
        //Loop from i to n
        while (i < n) {
            //Display prompt
            System.out.print("Add element " + (i + 1) + ": ");
            //Declare variable of type int and read it from the keyboard
            int element = sc.nextInt();
            //Check that the value entered is not negative
            if (element < 0) {
                System.out.println("Negative values not allowed. Try again.");
                //Return to the 'add element' step
                continue;
            }
            //If valid, add the element to the set
            mySet.add(element);
            //Increment i by 1
            i++;
        }
        //Display the set
        System.out.println(mySet);
    }

    //Method for checking that the set contains an element
    static void setContainsElements(int n, IntSet mySet, Scanner sc) {
        //Loop through the set as long as it is not empty
        while (!mySet.isEmpty()) {
            //Display prompt
            System.out.print("Enter the element to check (or -1 to stop): ");
            //Read value n from the keyboard
            n = sc.nextInt();
            //Set condition for exiting the loop
            if (n == -1) {
                break;
            }
            //Check if the value is negative
            if ((n != -1) && (n < 0)) {
                System.out.println("Negative values not allowed. Try again.");
                //Return to the 'enter element or stop' step
                continue;
            }
            //Set condition and message in case the element is in the set
            else if (mySet.contains(n)) {
                System.out.printf("Yes, %d is in the set.", n);
            }
            //Set condition and message in case the element is not in the set
            else {
                System.out.printf("No, %d is not in the set.", n);
            }
        }
    }

    //Method for removing elements
    static void removeSetElements(int n, IntSet mySet, Scanner sc) {
        //Loop through the set as long as it is not empty
        while (!mySet.isEmpty()) {
            //Display prompt
            System.out.print("Enter the element to be removed: ");
            //Read value n from the keyboard
            n = sc.nextInt();
            //Check that value n is in the set
            if (mySet.contains(n)) {
                //Remove value n from the set
                mySet.remove(n);
                //Display message that value n was removed
                System.out.println(n + " has been removed from the set");
                //If no element remains in the set, display message
                if (mySet.isEmpty()) {
                    System.out.println("The set is empty.");
                }
                //Display the updated set
                else {
                    System.out.println(mySet);
                }
            }
            //Display message if the value is not in the set
            else {
                System.out.println(n + " is not in the set");
            }
        }
    }
}