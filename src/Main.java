import Graph.Graph;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Testing the Graph ADT with a manual build ---");

        Graph myGraph = new Graph();

        // Check if the graph is empty
        System.out.println("Graph is empty? " + myGraph.isEmpty());

        // 1. Insert Nodes
        System.out.println("Inserting nodes into the graph...");
        for (int i = 0; i <= 8; i++) {
            myGraph.insertNode(i);
        }

        // Check if the graph is empty
        System.out.println("Graph is empty? " + myGraph.isEmpty());

        System.out.println("----------------------------------");

        // 2. Insert Edges
        System.out.println("Inserting edges...");
        myGraph.insertEdge(0, 1);
        myGraph.insertEdge(0, 2);
        myGraph.insertEdge(1, 2);
        myGraph.insertEdge(1, 0);
        myGraph.insertEdge(1, 3);
        myGraph.insertEdge(1, 4);
        myGraph.insertEdge(2, 0);
        myGraph.insertEdge(2, 1);
        myGraph.insertEdge(2, 5);
        myGraph.insertEdge(2, 6);
        myGraph.insertEdge(3, 1);
        myGraph.insertEdge(3, 7);
        myGraph.insertEdge(4, 1);
        myGraph.insertEdge(4, 8);
        myGraph.insertEdge(5, 2);
        myGraph.insertEdge(6, 2);
        myGraph.insertEdge(7, 3);
        myGraph.insertEdge(8, 4);
        myGraph.insertEdge(8, 6);

        System.out.println("----------------------------------");

        // 3. Test findNode operation
        System.out.println("Testing findNode operation:");
        System.out.println("Does node 5 exist? " + myGraph.findNode(5)); // true
        System.out.println("Does node 9 exist? " + myGraph.findNode(9)); // false

        System.out.println("----------------------------------");

        // 4. Print the graph to visualize the result
        myGraph.printGraph();
    }
}