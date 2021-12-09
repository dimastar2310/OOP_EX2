import api.DirectedWeightedGraph;
import api.EdgeData;
import api.NodeData;


import javax.swing.plaf.basic.BasicComboBoxUI;
import java.util.*;

//graph + algorithms on graph
public class _DirectedWeightedGraph implements DirectedWeightedGraph {
    //id to NodeData is i unique 0 id to to some node 1 to some node
    //g and edges are indepnted but,but in real they are
    //each src has unique dst witch is key of other hashmap
        // public ArrayList<Integer,EdgeData> ItHelper;
         public HashMap<Integer,EdgeData> ItHelper1; //dest edgeData
         public HashMap<Integer,NodeData> g ;
         private HashMap<Integer,HashMap<Integer,EdgeData>> e; //i give you src and dst give me EdgeData
       public ArrayList<NodeData> ND =new ArrayList<NodeData>(); //for test
       public  ArrayList<EdgeData> ED = new ArrayList<EdgeData>();
    //e.get(src).get()dst] --->EdgdeData
       public  HashMap<Integer,EdgeData> SpecificEd;
       public  ArrayList<EdgeData> SpecificEd1;
         //public Collection<NodeData> vals;

    protected static int ModeCaunt;
    private static int NC; //nodes caunt we have static method too doesnt metter
    private static int EC; //edge caunt
    private Iterator<EdgeData> p ;
    Iterator<NodeData>p1;


    public _DirectedWeightedGraph() {
     ModeCaunt = 0;
     NC = 0;
     EC = 0;
     e = new HashMap<Integer,HashMap<Integer,EdgeData>>();
     g = new HashMap<Integer,NodeData>();
     ItHelper1 = new HashMap<>();
     ED = new ArrayList<EdgeData>(); //ED of specifice id
     SpecificEd = new HashMap<>();
     SpecificEd1 = new ArrayList<>();
     //p = SpecificEd1.iterator();


    }
    public  _DirectedWeightedGraph(_DirectedWeightedGraph o){
        this.ModeCaunt=o.getMC();
        this.NC = o.ND.size();
        this.EC = o.ED.size();
        this.e = o.e;
        this.g = o.g;
        this.ItHelper1 = o.ItHelper1;
        this.ED = o.ED; //ED of specifice id
        this.SpecificEd = o.SpecificEd;
        this.SpecificEd1 = o.SpecificEd1;


    }

    @Override
    //this one is ok for sure
    //returning pointer to Node
    public NodeData getNode(int key) {

        return this.g.get(key);//if doesnt exist hashmapwill drow exeption
    }

    @Override
    //we returning pointer to edge or null
    public EdgeData getEdge(int src, int dest) { //mahzirim mazbia le Edge
       EdgeData lookingFor;
       if(!e.containsKey(src)){
           return null;
       }
       lookingFor = e.get(src).get(dest);
       return  lookingFor;

    }

    @Override
    public void addNode(NodeData n) { //maby key to obj not allowed much
       g.put(n.getKey(),n);


        NC++;
        ModeCaunt++;
        ND.add(n);
       //we need to represent neigbers in some way


    }
     //we have independed edges firsly
    //only when we connect we do link
    @Override
    //im kayam o litalem o lidros
    public void connect(int src, int dest, double w) {
       // Pair<Integer,Integer> p = new Pair<Integer,Integer>(src,dest);
        EdgeData p1 = new _EdgeData(src,dest,w);
        EdgeData t;
        //zarih livdok she 2 hanodes kayamim gam
        //nitalem im kayam
        if(!e.containsKey(p1)){ //im le kayam kaze edge
            //nivne link bein dst le edge data
            HashMap<Integer, EdgeData> someneighbor = new HashMap<Integer, EdgeData>();
            someneighbor.put(dest,p1); //<dest,p1>
            //now lets annoynes the edge hashmap
            ItHelper1.put(dest,p1); //<dest <src,dest> >
            e.put(src,someneighbor);

           EC++;
           ModeCaunt++;

        }
        }


    @Override
    //the values are nodes
    public Iterator<NodeData> nodeIter() { //<id ,node>
        //g.values().iterator()
        return ND.iterator();
        //return g.values().iterator();
    }

    @Override
    public Iterator<EdgeData> edgeIter() { //
        return ItHelper1.values().iterator();
    }


    @Override
    //we going to save does objects to hashmap
    public Iterator<EdgeData> edgeIter(int node_id) {

       //SpecificEd1
        //needed <dest,<src,dest>
        SpecificEd = e.get(node_id);
        //running not dest
        Iterator<EdgeData> e1  = SpecificEd.values().iterator();
        //e1.next().toString()
        //looking for special dest
        //for example 1 can be connected to 5 and 7 and 9
        //to make it special we do connection of key to key 1 to 5 for example
        //5 is destination its looks like that dest has alot of neighbors
        while (e1.hasNext()){
            if (e1.next().getSrc()==node_id){
                SpecificEd1.add(getEdge(e1.next().getSrc(), e1.next().getDest()));
            }
       }



        return SpecificEd1.iterator();
    }

    @Override
    //need to delet it from g
    //need to delete from e
    //should remove node and all the assosiasions
    //e[key][dest,<Edge>] //we need to disconect second link []
    public NodeData removeNode(int key) {
        NodeData r = getNode(key);
        g.remove(key);
        ModeCaunt++;
        e.get(key).clear();
        //Iterator<EdgeData> e = getEdge(ke
        return r;
    }

    @Override
    //e[src][dest] got removed
    public EdgeData removeEdge(int src, int dest) {
        EdgeData edge = e.get(src).get(dest);
        e.get(src).remove(dest);
        ModeCaunt++;
        return edge;
    }

    @Override
    public int nodeSize() {
        return NC;
    }

    @Override
    public int edgeSize() {
        return EC;
    }

    @Override
    public int getMC() {
        return ModeCaunt;
    }
    public void printNodes(){
        Iterator<NodeData> k = g.values().iterator();
        while (k.hasNext()){
            System.out.println(k.next()+" , ");
        }
    }
    public void printNodesTest(){
        Iterator<NodeData> k = ND.iterator();
        while (k.hasNext()){
            System.out.println(k.next() + " , ");
        }

    }


}
    /**this filds and constructor for dwg obj and graph **/



