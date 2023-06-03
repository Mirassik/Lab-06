import java.util.HashMap;
import java.util.Map;
    public class Vertex<V> {
        private final V data; // The data associated with the vertex
        private final Map<Vertex<V>, Double> adjacentVertices; // Map of adjacent vertices and their weights
        public Vertex(V data) {
            this.data = data;
            this.adjacentVertices = new HashMap<>(); // Initialize the map of adjacent vertices
        }
        public void addAdjacentVertex(Vertex<V> destination, double weight) {
            adjacentVertices.put(destination, weight); // Add the adjacent vertex with the weight to the map
        }
        public V getData() {
            return data;
        }
        public Map<Vertex<V>, Double> getAdjacentVertices() {
            return adjacentVertices;
        }
    }
