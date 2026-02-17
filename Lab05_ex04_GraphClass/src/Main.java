import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Open keyboard
        Scanner sc = new Scanner(System.in);
        //Display prompt
        System.out.print("Enter the number of nodes: ");
        //Declare variable of type int and read it from the keyboard
        int n = sc.nextInt();
        sc.nextLine();
        //Declare variable of type Graph and set the number of its elements to n
        Graph graph = new Graph(n);
        //Display prompt
        System.out.println("Enter the edges: ");
        //Loop from i = 0 to n, incrementing k by 1
        for (int i = 0; i < n; i++) {
            System.out.print("From: ");
            int u = sc.nextInt();
            System.out.print("To: ");
            int v = sc.nextInt();
            graph.addEdge(u, v);
        }
        //Display section title
        System.out.println("=== Adjacents List ===");
        //Display each node and its adjacents
        System.out.println(graph);
        //Display section title
        System.out.println("=== Graph Tests ===");
        int u, v;
        while (true) {
            // Display prompts
            System.out.print("Enter node 1 (or -1 to exit): ");
            u = sc.nextInt();
            if (u == -1) {
                break;
            }
            System.out.print("Enter node 2: ");
            v = sc.nextInt();
            System.out.println("Edge between " + u + " and " + v + " - " + graph.isEdge(u, v));

            // Display prompts
            System.out.print("Enter node: ");
            u = sc.nextInt();
            System.out.println("Node out-degrees: " + graph.nodeDegree(u, DegreeType.OUT));
            System.out.println("Node in-degrees: " + graph.nodeDegree(u, DegreeType.IN));
        }

    }
}