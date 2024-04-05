import java.util.HashMap;
import java.util.Map;

public class ConnectedComponents {

    /*
     * TODO
     */
    public static <V> void
    connected_components(Graph<V> G, Map<V, V> representative) {
        // your code goes here
        /*do search, create adjacency list, then whichever vertex is connected to the
        * most vertices is the representative for those vertices, if a vertex isn't
        * connected to any, set itself as its representative, maybe have temp list to
        * be removing vertices from, that way if there are vertices left after
        * choosing first representative, do the same but with whichever one now has
        * the most connections*/
        UndirectedAdjacencyList connections = depthSearch(G);

    }

    public static <V> UndirectedAdjacencyList depthSearch(Graph<V> G){
        UndirectedAdjacencyList connections = new UndirectedAdjacencyList(G.numVertices());

        return null;
    }


}
