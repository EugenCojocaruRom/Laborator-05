import java.util.ArrayList;
import java.util.List;

//Unoriented graph
public class Graph {

    //Declare variable of type int for number of nodes
    private int nodesNumber;
    //Declare an adjacents list - each node contains its neighbours
    List<List<Integer>> adj;

    //Constructor - has the number of nodes as argument
    public Graph(int nodesNumber) {
        this.nodesNumber = nodesNumber;
        //Create the adjacents list
        adj = new ArrayList<>();
        //Loop through the number of nodes from i = 0 to the value of nodesNumber, incrementing i by 1
        for (int i = 0; i < nodesNumber; i++) {
            //Create an empty list of neighbours for each node
            adj.add(new ArrayList<>());
        }
    }

    //Method for getting the size of the graph (number of nodes)
    public int size() {
        return nodesNumber;
    }

    //Method for adding edges between 2 nodes
    public void addEdge(int u, int v) {
        //Add edge from node v to node w
        adj.get(u).add(v);
        //Add edge from node w to node v
        adj.get(v).add(u);
    }

    //Method for checking if there is an edge between two nodes
    public boolean isEdge(int u, int v) {
        return adj.get(u).contains(v);
    }

    //Method for finding the out-degree and the in-degree of a node
    public int nodeDegree(int node, DegreeType type) {
        //Set condition for finding and displaying the out-degrees
        if (type == DegreeType.OUT) {
            return adj.get(node).size();
        }
        int inDegree = 0;
        for  (int i = 0; i < adj.size(); i++) {
            if (this.isEdge(i, node)) {
                inDegree++;
            }
        }
        return inDegree;
    }

    //Method 'toString'
    @Override
    public String toString() {
        for (int i = 0; i < nodesNumber; i++) {
            System.out.println(i + " -> " + adj.get(i));
        }
        return "";
    }
}
