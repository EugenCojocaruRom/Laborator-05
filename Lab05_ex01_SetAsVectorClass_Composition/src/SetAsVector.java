import java.util.Vector;

public class SetAsVector {

    //Declare object of type Vector; set as private
    private Vector<Object> vector;

    //Constructor - specifies the capacity of the vector (n - as set in the Main class)
    public SetAsVector(int n) {
        //Declare vector and set its capacity to n
        vector = new Vector<>(n);
    }

    //Method - add element
    public boolean add(Object element) {
        //Add element to vector by calling the 'add' method of the Vector class
        vector.add(element);
        //Return true
        return true;
    }

    //Method - remove element
    public boolean remove(Object element) {
        //Remove element from vector by calling the 'remove' method of the Vector class
        vector.remove(element);
        //Return true
        return true;
    }

    //Method - contains element
    public boolean contains(Object element) {
        //Call the 'contains' method of the Vector class
        return vector.contains(element);
    }

    //Method - toString
    public String toString() {
        //Call the 'toString' method of the Vector class
        return vector.toString();
    }
}
