import api.DirectedWeightedGraph;
import api.DirectedWeightedGraphAlgorithms;
import api.EdgeData;
import api.NodeData;
import com.google.gson.Gson;
import  com.google.gson.GsonBuilder;

import java.util.Iterator;

/**
 * This class is the main class for Ex2 - your implementation will be tested using this class.
 */

public class Ex2 {
    //  static DirectedWeightedGraph t = new _DirectedWeightedGraph();

    /**
     * This static function will be used to test your implementation
     *
     * @param json_file - a json file (e.g., G1.json - G3.gson)
     * @return
     */
    //here we checking with obj graph initing
    public static DirectedWeightedGraph getGrapg(String json_file) {
        //obj to json
        //json to obj
        DirectedWeightedGraph ans = new _DirectedWeightedGraph();

        DirectedWeightedGraphAlgorithms p = (DirectedWeightedGraphAlgorithms) ans;
        p.save(json_file);
        p.load(json_file);
        // ****** Add your code here ******

        return ans;
    }
    //may need try and catch
//    private static boolean load_g(DirectedWeightedGraph ans) {
//        return false;
//    }
//
//    private static boolean save_g(DirectedWeightedGraph ans) {
//        return false;
//    }

    /**
     * This static function will be used to test your implementation
     *
     * @param json_file - a json file (e.g., G1.json - G3.gson)
     * @return
     */
    public static DirectedWeightedGraphAlgorithms getGrapgAlgo(String json_file) {
        DirectedWeightedGraphAlgorithms ans = new _DirectedWeighedGraphAlgorithms();
        // ****** Add your code here ******
        ans.load(json_file);
        ans.save(json_file);
        // ********************************
        return ans;
    }

    /**
     * This static function will run your GUI using the json fime.
     *
     * @param json_file - a json file (e.g., G1.json - G3.gson)
     */
    public static void runGUI(String json_file) {
        DirectedWeightedGraphAlgorithms alg = getGrapgAlgo(json_file);

        // ****** Add your code here ******
        //
        // ********************************
    }

    private class TestTest {
        String name;
        String age;

        public TestTest(String name, String age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return "TestTest{" +
                    "name='" + name + '\'' +
                    ", age='" + age + '\'' +
                    '}';
        }
    }


    public static void main(String[] args) {
        _DirectedWeightedGraph _DWG = new _DirectedWeightedGraph();
        String jsonString = "{\"name\":\"Dima\", \"age\":29}";
        //GsonBuilder builder = new GsonBuilder();
        Gson gson = new Gson();
        TestTest t = gson.fromJson(jsonString, TestTest.class);
        System.out.println(t.age);


        //Gson gson = new GsonBuilder().create();
        // String b =gson.fromJson("G1.json",)
        // System.out.println(gson);
        //  String json = gson.fromJson("data\G1.json",Class<String>);


        EdgeData a = new _EdgeData(1, 2, 3.2);
        EdgeData b = new _EdgeData(4, 3, 10.3);
        EdgeData c = new _EdgeData(3, 2, 15.2);
        EdgeData d = new _EdgeData(6, 100, 100.3);
        EdgeData g = new _EdgeData(6, 200, 200);
        EdgeData k = new _EdgeData(6, 150, 200);
        EdgeData e = new _EdgeData(5, 7, 800.3);
        EdgeData f = new _EdgeData(1, 8, 0.0); //checking what will happen


       _NodeData T1 = new _NodeData(6, 100, 0.0);
       T1.setId(3);
        _NodeData T2 = new _NodeData(6, 150, 0.0);
        T2.setId(3);
        _NodeData T3 = new _NodeData(6, 200, 0.0);
        T3.setId(3);




        //   _DirectedWeightedGraph _DWG = new _DirectedWeightedGraph();
        _DWG.addNode(new _NodeData(1, 2, 0.0));
        _DWG.addNode(new _NodeData(2, 0, 0.0));
        _DWG.addNode(new _NodeData(3, 2, 0.0));
        _DWG.addNode(new _NodeData(4, 3, 0.0));
        _DWG.addNode(new _NodeData(5, 7, 0.0));
        _DWG.addNode(T1);
        _DWG.addNode(T2);
        _DWG.addNode(T3);

        _DWG.connect(a.getSrc(), a.getDest(), a.getWeight());
        _DWG.connect(b.getSrc(), b.getDest(), b.getWeight());
        _DWG.connect(c.getSrc(), c.getDest(), c.getWeight());
        _DWG.connect(d.getSrc(), d.getDest(), d.getWeight());
        _DWG.connect(e.getSrc(), e.getDest(), e.getWeight());
        _DWG.connect(f.getSrc(), f.getDest(), f.getWeight());
        _DWG.connect(g.getSrc(), g.getDest(), g.getWeight());
        _DWG.connect(k.getSrc(), k.getDest(), k.getWeight());
        //_DWG.printNodes();
        //
        Iterator<EdgeData> EI = _DWG.edgeIter();
        while (EI.hasNext()) {
            System.out.println(EI.next() + " ");
        }
       // _DWG.printNodesTest();


        Iterator<NodeData> NI = _DWG.nodeIter();
         // NI.next();
         while (NI.hasNext()) {
             NodeData n = NI.next();
            System.out.println(n +",");

        }


        // System.out.println(n);

         // _DWG.printNodesTest();
        Iterator<EdgeData> EI2 = _DWG.edgeIter(3);
        while (EI2.hasNext()) {
            System.out.println(EI2.next() + " , ");
        }




    }
}
