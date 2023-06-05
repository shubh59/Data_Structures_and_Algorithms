
public class AdjacencyMatrixM {

    public static void main(String[] args) {

        Graph graph = new Graph(5);

        graph.addNode(new Node('A'));
        graph.addNode(new Node('B'));
        graph.addNode(new Node('C'));
        graph.addNode(new Node('D'));
        graph.addNode(new Node('E'));

        graph.addEdeg(0, 1);
        graph.addEdeg(1, 2);
        graph.addEdeg(2, 3);
        graph.addEdeg(2, 4);
        graph.addEdeg(4, 0);
        graph.addEdeg(4, 2);

        graph.print();

        System.out.println(graph.checkEdeg(0, 3));
    }
}
