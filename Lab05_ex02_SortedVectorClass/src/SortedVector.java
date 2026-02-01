import java.util.Collections;
import java.util.Comparator;
import java.util.Vector;

public class SortedVector extends Vector<Object> {

    //Constructor
    public SortedVector(int n) {
        super(n);
    }

    //Methods
    //1. Add element to SortedVector
    //Override the method from the parent class (Vector)
    @Override
    public void addElement(Object element) {
        //Call the 'add' method of the Vector class; add element at the end
        super.add(element);
        //Call the Collections.sor() method --> 'this' is the current SortedVector + using the Comparator interface
        Collections.sort(this, new Comparator<Object>() {
            //Override the compare() method of the Comparator
            @Override
            public int compare(Object o1, Object o2) {
                //Check if object 1 and object 2 are both instances of Comparable
                if (o1 instanceof Comparable && o2 instanceof Comparable) {
                    //Cast o1 to Comparable and call the compareTo() method to compare o1 to o2 (also cast to Comparable)
                    return ((Comparable) o1).compareTo((Comparable) o2);
                }
                //Return 0 if o1 = o2
                return 0;
            }
        });
    }

    //2. Insert element into SortedVector
    //Override the method from the parent class (Vector)
    @Override
    public void insertElementAt(Object element, int index) {
        //Call the 'insertElement' method of the Vector class; insert element at a given position/index
        super.insertElementAt(element, index);
        //Call the Collections.sor() method --> 'this' is the current SortedVector + using the Comparator interface
        Collections.sort(this, new Comparator<Object>() {
            //Override the compare() method of the Comparator
            @Override
            public int compare(Object o1, Object o2) {
                //Check if object 1 and object 2 are both instances of Comparable
                if (o1 instanceof Comparable && o2 instanceof Comparable) {
                    //Cast o1 to Comparable and call the compareTo() method to compare o1 to o2 (also cast to Comparable)
                    return ((Comparable) o1).compareTo((Comparable) o2);
                }
                //Return 0 if o1 = o2
                return 0;
            }
        });
    }

    //3. Display as string
    public String toString() {
        return super.toString();
    }
}
