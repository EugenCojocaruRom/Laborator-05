import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Open keyboard
        Scanner sc = new Scanner(System.in);
        //Display prompt for the user
        System.out.print("Enter the number of elements: ");
        //Declare variable of type int and read it from the keyboard
        int n = sc.nextInt();
        sc.nextLine();
        //Declare variable vector of type SetAsVector and set the number of its elements to n
        SetAsVector vector = new SetAsVector(n);

        //Display section title
        System.out.println("<=== Add element to vector ===>");
        //Call 'add' method
        addToVector(vector, n, sc);
        //Display separator
        System.out.println("===============================");

        //Display section title
        System.out.println("<=== Remove element from vector ===>");
        //Call 'remove' method
        removeFromVector(vector, n, sc);
        //Display separator
        System.out.println("=============================");

    }

        // ** Methods **
    //1. Method for adding elements to vector
    static void addToVector(SetAsVector vector, int n, Scanner sc) {
        //Loop from i = 0 to the number of elements in the vector (n), incrementing i by 1
        for  (int i = 0; i < n; i++) {
            //Display prompt for the user
            System.out.print("Enter element " + (i + 1) + ": ");
            //Declare variable of type string and read it from the keyboard
            String element = sc.nextLine();
            //Declare variable of type boolean to check that the element was added to the vector
            boolean isElementAdded = vector.add(element);
            //Set conditions for adding an element to the vector
            //When the element is added successfully
            if (isElementAdded) {
                //Display confirmation message
                System.out.println(element + " was added to the vector");
            }
            //If the element is a duplicate (and not added)
            else {
                //Display message for the user
                System.out.println(" > Duplicate element, not added to the vector");
                //Decrement i so that the loop returns to the previous step ('Enter element')
                i--;
            }
            //Display the vector with its current elements, at each iteration
            System.out.println("The current vector is: " + vector);
        }
    }

    //2. Method for removing elements from vector
    static void removeFromVector(SetAsVector vector, int n, Scanner sc) {
        //Loop from i = 0 to the number of elements in the vector (n), incrementing i by 1
        for  (int i = 0; i < n; i++) {
            //Display prompt for the user
            System.out.print("Element to remove: ");
            //Declare variable of type string and read it from the keyboard
            String element = sc.nextLine();
            //Declare variable of type boolean to check if the element is in the vector
            boolean isElementInVector = vector.contains(element);
            //Set conditions for checking that an element is in the vector
            //When the element is in the vector
            if (isElementInVector) {
                //The element is removed
                vector.remove(element);
                //Display confirmation message
                System.out.println(element + " was removed from the vector");
            }
            //If the element is not in the vector
            else {
                //Display message for the user
                System.out.println(" > This element is not in the vector.");
                //Decrement i so that the loop returns to the previous step ('Element to remove')
                i--;
            }
            //Display the vector with its current elements, at each iteration
            System.out.println("The current vector is: " + vector);
        }
    }
}