package tw.exact;

import agape.algos.MIS;
import edu.uci.ics.jung.graph.util.Pair;
import org.apache.commons.collections15.Factory;
import edu.uci.ics.jung.graph.SparseGraph;

public class MisCalculator {
    static public int calculateMis(tw.exact.Graph graph, XBitSet vertexSet) {
        SparseGraph<Integer, Integer> sg = new SparseGraph<>();
        MIS<Integer, Integer> mis = new MIS<>(sg.getFactory(), new Factory<Integer>() {
            @Override
            public Integer create() {
                return null;
            }
        }, new Factory<Integer>() {
            @Override
            public Integer create() {
                return null;
            }
        });

        SparseGraph<Integer, Integer> misGraph = new SparseGraph<>();
        if (vertexSet.cardinality() == 7)
        {
            int d = 4;
        }
        for (int i : vertexSet.toArray()) {

                misGraph.addVertex(i);
        }
        int count = 0;
        for (int v : misGraph.getVertices() ) {
            for (int u : misGraph.getVertices() ) {
                if (u > v && graph.areAdjacent(u,v)) {
                    misGraph.addEdge(count++, new Pair<>(u,v));
                }
            }

        }


        int result =  mis.maximumIndependentSetMoonMoserNonRecursive(misGraph).size();
        if (result == 7)
        {
            int b = 5;
        }
        return result;
    }
}
