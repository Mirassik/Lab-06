public class BreadthFirstSearch<V> implements Search<V> {
        private final WeightedGraph<V> graph;
        public BreadthFirstSearch(WeightedGraph<V> graph) {
            this.graph = graph;
        }

        @Override
        public void Search(Vertex<V> start) {
            graph.BFS(start);
        }
    }
