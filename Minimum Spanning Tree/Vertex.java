package graph.model;



public class Vertex{
    private int    number;
    private double abs, ord;
   


    public Vertex(){
	number = 0;
	abs    = 0;
	ord    = 0;
    }

    public Vertex(int v, double a, double ord){
	number = v;
	abs    = a;
	ord    = ord;
    }


    public double distance(Vertex v){
	return Math.sqrt( Math.pow((abs - v.abs), 2) + Math.pow((ord - v.ord), 2));
    }
    
    public int getNumber(){
	return number;
    }

    public double getAbs(){
	return abs;
    }

    public double getOrd(){
	return ord;
    }

  


}
