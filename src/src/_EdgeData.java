package src;

import api.EdgeData;

public class _EdgeData implements EdgeData {
    private  int Src;
    private int Dest;
    private double Weight;
    private String Info;
    private int Tag;
    private static int e_caunt;



   public _EdgeData(){
       this.Src = 0;
       this.Dest =0;
       this.Weight =0.0;
       this.Info = "";
       this.Tag = 0;
       e_caunt++;

   }
    public _EdgeData(_EdgeData other){
        this.Src = other.Src;
        this.Dest = other.Dest;
        this.Weight = other.Weight;
        this.Info = other.Info;

    }
   public _EdgeData(int s,int d,double w){
       this.Src = s;
       this.Dest = d;
       this.Weight = w;
      // this.edgeToNode = new HashMap<NodeData,EdgeData>();

   }
    public _EdgeData(int s,int d){
        this.Src = s;
        this.Dest = d;


    }


    //setters needed too
    public void setWeight(double w){
       this.Weight = w;
    }
    @Override
    public int getSrc() {
        return Src;
    }

    @Override
    public int getDest() {
        return Dest;
    }

    @Override
    public double getWeight() {
        return Weight;
    }

    @Override
    public String getInfo() {
        return Info;
    }

    @Override
    public void setInfo(String s) {
    this.Info = s;
    }

    @Override
    public int getTag() {
        return Tag;
    }

    @Override
    public String toString() {
        return "src._EdgeData{" +
                "Src=" + Src +
                ", Dest=" + Dest +
                ", Weight=" + Weight +
                ", Info='" + Info + '\'' +
                ", Tag=" + Tag +
                '}';
    }

    @Override
    public void setTag(int t) {
     this.Tag = t;
    }
}
