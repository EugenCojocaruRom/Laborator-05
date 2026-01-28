import java.util.Vector;

//Using 'inheritance' (IS-A approach)
public class SetAsVector extends Vector<Object> {

    //Constructor - specifies the capacity of the vector (n - as set in the Main class)
    public SetAsVector(int n) {
        super(n);
    }

    //Methods
    //1. Override the 'add' method from the Vector class so as to reject duplicates
    @Override
    //Method for adding an element to the vector
    public boolean add(Object element) {
        //Condition for checking if the element already exists in the vector
        if (this.contains(element)) {
            //If the element exists, it is not added -> duplicates are not allowed
            return false;
        }
        //Call the 'add' method from the parent class (super = Vector)
        return super.add(element);
    }

    //2. Override the 'remove' method from the Vector class so as to check if the element exists in the vector before removing it
    public boolean remove(Object element) {
        if (!this.contains(element)) {
            return false;
        }
        return super.remove(element);
    }

    //'contains' method inherited from Vector (the super class)
    public boolean contains(Object element) {
        return super.contains(element);
    }

    //'toString' method inherited from Vector
    public String toString() {
        //Call the 'toString' method inherited from the Vector class
        return super.toString();
    }
}
