import api.DirectedWeightedGraph;
import api.DirectedWeightedGraphAlgorithms;
import api.NodeData;

import java.util.List;

public class _DirectedWeighedGraphAlgorithms implements DirectedWeightedGraphAlgorithms {

    _DirectedWeightedGraph g;
    public _DirectedWeighedGraphAlgorithms(){
        g = new _DirectedWeightedGraph();
    }
    @Override
    //inits graph here
    public void init(DirectedWeightedGraph g) {
        this.g = (_DirectedWeightedGraph) g;

    }

    @Override
    public DirectedWeightedGraph getGraph() {
        return g;
    }
    //need to do copy constructor
    @Override
    /**computes deep copy of this graph**/

    public DirectedWeightedGraph copy() {
        _DirectedWeightedGraph g1 = new _DirectedWeightedGraph(this.g);
        return g1;
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
