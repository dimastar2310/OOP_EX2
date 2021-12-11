package Our_Proj;

import api.DirectedWeightedGraph;
import api.DirectedWeightedGraphAlgorithms;
import api.EdgeData;
import com.google.gson.Gson;

import java.util.Iterator;

/**
 * This class is the main class for Our_Proj.Ex2 - your implementation will be tested using this class.
 */

public class Ex2 {
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
        // ****** Add your code here ******
        return ans;
    }

    /**
     * This static function will be used to test your implementation
     *
     * @param json_file - a json file (e.g., G1.json - G3.gson)
     * @return
     */
    public static DirectedWeightedGraphAlgorithms getGrapgAlgo(String json_file) {
        DirectedWeightedGraphAlgorithms ans = new _DirectedWeighedGraphAlgorithms();
        // ****** Add your code here ******

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

        //////////////// json working ////////////////////////////
        String jsonString = "{\"name\":\"Dima\", \"age\":29}";
        //GsonBuilder builder = new GsonBuilder();
        Gson gson = new Gson();
        TestTest t = gson.fromJson(jsonString, TestTest.class);
        //System.out.println(t.age);
        ///////////////////////////////////////////////////////////

        _NodeData T1 = new _NodeData(1, 100, 0.0);
        _NodeData T2 = new _NodeData(2, 100, 0.0);
        _NodeData T3 = new _NodeData(3, 100, 0.0);
        _NodeData T4 = new _NodeData(4, 100, 0.0);
        _NodeData T5 = new _NodeData(5, 100, 0.0);
        _NodeData T6 = new _NodeData(6, 100, 0.0);
        _NodeData T7 = new _NodeData(7, 100, 0.0);
        _DWG.addNode(T1);
        _DWG.addNode(T2);
        _DWG.addNode(T3);
        _DWG.addNode(T4);
        _DWG.addNode(T5);
        _DWG.addNode(T6);
        _DWG.addNode(T7);
        T1.setId(43);
        T2.setId(76);

        T3.setId(900);
        T4.setId(566);
        T5.setId(344);

        T6.setId(132);
        T7.setId(534);



        _DWG.connect(T1.getKey(),T3.getKey(),1);
        _DWG.connect(T1.getKey(),T4.getKey(),1);
        _DWG.connect(T1.getKey(),T5.getKey(),1);

        _DWG.connect(T2.getKey(),T6.getKey(),1);
        _DWG.connect(T2.getKey(),T7.getKey(),1);


       // _DWG.PrintEdgesGraph();

        System.out.println("_____________________________________________________________\n\n\n");

          Iterator<EdgeData> EI = _DWG.edgeIter();
          while ((EI.hasNext())){
              System.out.println(EI.next());
          }




        System.out.println("_____________________________________________________________\n\n\n");
          Iterator<EdgeData> Ed = _DWG.edgeIter(43);

        while (Ed.hasNext()){
            System.out.println(Ed.next());
        }


    }
}
