import java.util.BitSet;

public class IntSet {

    //Declare internal (private) variable of type BitSet - for storing the set's elements
    private BitSet myIntSet;

    //Constructor
    public IntSet(int n) {
        //Create a new BitSet instance
        this.myIntSet = new BitSet();
    }

    //Method for adding values to the IntSet
    public void add(int value) {
        //Check that the value to be added is positive
        if (value >= 0) {
            myIntSet.set(value, true);
        }
        //Display warning message if the value is negative and do not add it to the set
        else {
            System.out.println("The value cannot be negative.");
        }
    }

    //Method for removing values from the IntSet
    public void  remove(int value) {
        //Check that the value is valid
        if (value >= 0) {
            //Set the value to false, meaning it is no longer part of the set (it was removed)
            myIntSet.set(value, false);
        }
        //Display warning message if the value is negative and therefore it cannot be in the set
        else {
            System.out.println("The value cannot be negative.");
        }
    }

    //Method for checking that a value is in the IntSet
    public boolean contains(int value) {
        //Check that the value is valid
        if (value < 0) {
            //Display message if the value is negative
            System.out.println("Negative values are not allowed in the set.");
            return false;
        }
        //Return the bit at the position indicated by the value
        else {
            return myIntSet.get(value);
        }
    }

    //Override the 'toString' method
    @Override
    public String toString() {
        return "IntSet values: " + myIntSet;
    }

    //Method for checking if the set is empty
    public boolean isEmpty() {
        return myIntSet.isEmpty();
    }
}
