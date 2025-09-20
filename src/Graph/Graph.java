package Graph;

import Graph.Node.Node;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Graph {
    private Map<Integer, Node> nodes;

    public Graph() {
        this.nodes = new HashMap<>();
    }

    public void insertNode(int value) {
        if (!nodes.containsKey(value)) {
            nodes.put(value, new Node(value));
        }
    }

    public void insertEdge(int origin, int destination) {
        Node originNode = nodes.get(origin);
        Node destinationNode = nodes.get(destination);

        if (originNode != null && destinationNode != null) {
            originNode.setChildren(destinationNode);
        } else {
            System.out.println("Error: One or both nodes do not exist in the graph.");
        }
    }

    public boolean isEmpty() {
        return nodes.isEmpty();
    }

    public boolean findNode(int value) {
        return nodes.containsKey(value);
    }

    public void printGraph() {
        System.out.println("Graph Representation:");
        for (Integer value : nodes.keySet()) {
            System.out.print("Node " + value + " -> ");
            List<Node> children = nodes.get(value).getChildren();
            if (children.isEmpty()) {
                System.out.println("[]");
            } else {
                for (Node child : children) {
                    System.out.print(child.getValue() + " ");
                }
                System.out.println();
            }
        }
    }
}