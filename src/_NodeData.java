import api.EdgeData;
import api.GeoLocation;
import api.NodeData;

import java.awt.*;
import java.util.HashMap;
//import api._EdgeData;
//must hold at list 20 edges 10 inner 10 outer
public  class _NodeData implements NodeData,GeoLocation {
    private static int n_caunt;
    private int id;
    //not sure if path needed
    private java.util.List<_NodeData> path;



    private String info = "";
    private int Tag_;
    private double Weight_ = 0.0;
    private double x;
    private double y;
    private double z;

//HashMap is O(1)
    public _NodeData() {
        this.x = 0.0;
        this.y = 0.0;
        this.z = 0.0;
        n_caunt++;
    }

    public _NodeData(double x, double y, double z) {
        this.x = x;
        this.y= y;
        this.z = z;

    }


    public void setId(int id){
        this.id = id;
    }

    @Override
    public String toString() {
        String s = "------ Node #"+this.id+" ------\n" +
                "   - Coord (x,y,z) = ( "+x()+" , "+y()+" , "+z()+")\n" +
                "   - Info = "+this.info;
        return s;
    }
    @Override
    public int getKey() {
        return this.id;
    }
    @Override
    public double x() {
        return this.x;
    }
    @Override
    public double y() {
        return this.y;
    }
    @Override
    public double z() {
        return this.z;
    }
    @Override
    public String getInfo() {
        return this.info;
    }
    @Override
    public void setInfo(String s) {
        this.info = s;
    }
    @Override
    public int getTag() {
        return this.Tag_;
    }
    @Override
    public void setTag(int t) {
        this.Tag_ = t;
    }
    @Override
    //if this this null then null
    public GeoLocation getLocation() {
        //Point a = this.coord;
        GeoLocation b = this; //the interface will take fields and functions that needed
        return b;
    }
    @Override
    public void setLocation(GeoLocation p) {
        this.x = p.x();
        this.y = p.y();
        this.z = p.z();
    }
    @Override
    public double distance(GeoLocation g) {
        double s1s = Math.sqrt (Math.pow (g.x()-g.y(),2) + Math.pow (this.x-this.y,2));
        double s2s = Math.sqrt (Math.pow (g.z()-g.x(),2) + Math.pow (this.z-this.x,2));
        double s3s = Math.sqrt (Math.pow (g.z()-g.y(),2) + Math.pow (this.z-this.y,2));
        return (s1s+s2s+s3s)/3;
    }
    @Override
    public double getWeight() {
        return this.Weight_;
    }
    @Override
    public void setWeight(double w) {
        this.Weight_ = w;
    }
}
