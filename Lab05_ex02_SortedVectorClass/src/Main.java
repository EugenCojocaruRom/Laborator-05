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
        SortedVector vector = new SortedVector(n);

        //Display section title
        System.out.println("<=== Add element ===>");
        //Call 'add' method
        addVectorElement(vector, n, sc);
        //Display separator
        System.out.println("========================");

        //Display section title
        System.out.println("<=== Insert element ===>");
        //Call 'remove' method
        insertElementInVector(vector, n, sc);
        //Display separator
        System.out.println("========================");
    }

    // ** Methods **
    //1. Method for adding elements to the vector
    static void addVectorElement(SortedVector vector, int n, Scanner sc) {
        //Loop from int i = 0 to n, incrementing i by 1
        for (int i = 0; i < n; i++) {
            //Display prompt for entering an element
            System.out.print("Add element " + (i + 1) + ": ");
            //Declare variable of type int and read it from the keyboard
            int element = sc.nextInt();
            //Add the element to the vector (at the end)
            vector.addElement(element);
            //Display the current vector
            System.out.println("The vector (sorted) is now: " + vector);
        }
    }

    //2. Method for inserting an element at a specific position in the vector
    static void insertElementInVector(SortedVector vector, int n, Scanner sc) {
        //Loop from int i = 0 to n, incrementing i by 1
        for (int i = 0; i < n; i++) {
            //Display prompt for entering the element to be inserted
            System.out.print("Insert element " + (i + 1) + ": ");
            //Declare variable of type int and read it from the keyboard
            int insertElement = sc.nextInt();
            //Display prompt for entering the position where the element will be inserted
            System.out.println("Enter position in the vector (0 to " + vector.size() + "): ");
            //Declare variable of type int and read it from the keyboard
            int position = sc.nextInt();
            //Set condition to check the value of the position
            if (position >= 0 && position <= vector.size()) {
                //Insert the element into the vector at the specified position
                vector.insertElementAt(insertElement, position);
                //Display the current vector
                System.out.println("The vector (sorted) is now: " + vector);
            }
            else {
                //Display message for the user
                System.out.println("Invalid value. Try again");
                //Return to the previous step ('Enter position')
                i--;
            }
        }
    }
}