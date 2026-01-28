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
        addElement(vector, n, sc);
        //Display separator
        System.out.println("===============================");

        //Display section title
        System.out.println("<=== Remove element from vector ===>");
        //Call 'remove' method
        removeElement(vector, n, sc);
        //Display separator
        System.out.println("=============================");

    }

    // ** Methods **
    //1. Method for adding elements to the vector
    public static void addElement(SetAsVector vector, int n, Scanner sc) {
        //Loop from i = 0 to the number of elements in the vector (n), incrementing i by 1
        for (int i = 0; i < n; i++) {
            //Display prompt for the user
            System.out.print("Add element: ");
            //Declare variable of type string and read it from the keyboard
            String element = sc.nextLine();
            //Set the conditions for adding an element to the vector --> avoid duplicates
            //Check that the element is not in the vector
            if (!vector.contains(element)) {
                //Add the element to the vector
                vector.add(element);
                //Display confirmation message
                System.out.println(" > Element " + element + " added to vector");
            }
            //In case the element is already in the vector
            else {
                //Display message for the user
                System.out.println(" > Duplicate element, not added to vector");
                //Decrement i so that the loop returns to the previous step ('Add element')
                i--;
            }
            //Display the vector with its current elements, at each iteration
            System.out.println("The current vector is: " + vector);
        }
    }

    //2. Method for removing elements from the vector
    public static void removeElement(SetAsVector vector, int n, Scanner sc) {
        //Loop from i = 0 to the number of elements in the vector (n), incrementing i by 1
        for  (int i = 0; i < n; i++) {
            //Display prompt for the user
            System.out.print("Element to remove: ");
            //Declare variable of type string and read it from the keyboard
            String element = sc.nextLine();
            //Set the conditions for removing an element from the vector
            //Check that the element is in the vector
            if (vector.contains(element)) {
                //Remove the element from the vector
                vector.remove(element);
                //Display confirmation message
                System.out.println(" > Element " + element + " removed from vector");
            }
            //In case the element is not in the vector
            else {
                //Display message for the user
                System.out.println(" > This element is not in the vector");
                //Decrement i so that the loop returns to the previous step ('Element to remove')
                i--;
            }
            //Display the vector with its current elements, at each iteration
            System.out.println("The current vector is: " + vector);
        }
    }
}