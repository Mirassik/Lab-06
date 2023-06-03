import java.util.Map;
public class DijkstraSearch<V> implements Search<V> {
    private WeightedGraph<V> graph; // The graph to perform the search on
    public DijkstraSearch(WeightedGraph<V> graph) {
        this.graph = graph;
    }

    @Override
    public void Search(Vertex<V> start) {
        Map<Vertex<V>, Double> distances = graph.Dijkstra(start);
        for (Map.Entry<Vertex<V>, Double> entry : distances.entrySet()) {
            Vertex<V> vertex = entry.getKey();
            double distance = entry.getValue();
            System.out.println("Vertex " + vertex.getData() + ": " + distance);
        }
    }
}