import api.DirectedWeightedGraph;
import api.DirectedWeightedGraphAlgorithms;
import api.NodeData;

import java.util.List;

public class _DirectedWeighedGraphAlgorithms implements DirectedWeightedGraphAlgorithms {

    DirectedWeightedGraph g;
    public _DirectedWeighedGraphAlgorithms(){
        g = new _DirectedWeightedGraph();
    }
    @Override
    public void init(DirectedWeightedGraph g) {
        this.g = g;

    }

    @Override
    public DirectedWeightedGraph getGraph() {
        return g;
    }
    //need to do copy constructor
    @Override
    public DirectedWeightedGraph copy() {
        return null;
    }

    @Override
    public boolean isConnected() {
        return false;
    }

    @Override
    public double shortestPathDist(int src, int dest) {
        return 0;
    }

    @Override
    public List<NodeData> shortestPath(int src, int dest) {
        return null;
    }

    @Override
    public NodeData center() {
        return null;
    }

    @Override
    public List<NodeData> tsp(List<NodeData> cities) {
        return null;
    }

    @Override
    public boolean save(String file) {
        return false;
    }

    @Override
    public boolean load(String file) {
        return false;
    }
}
