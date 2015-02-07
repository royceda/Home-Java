package graph.model;



public class Vertex{
    private int number;
    private int abs, ord;


    public Vertex(){
	number = 0;
	abs    = 0;
	ord    = 0;
    }

    public Vertex(int v, int a, int ord){
	number = v;
	abs    = a;
	ord    = ord;
    }
    
    public int getNumber(){
	return number;
    }

    public int getAbs(){
	return abs;
    }

    public int getOrd(){
	return ord;
    }



}
