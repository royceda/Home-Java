package graph.model;

public class Edge implements Comparable<Edge>{
    private Vertex v1;
    private Vertex v2;


    public Edge(){
	v1 = new Vertex();
	v2 = new Vertex();
    }
    
    public void setVertex(Vertex u, Vertex v){
	v1 = u;
	v2 = v;
    }
    
    public Vertex getV1(){
	return v1;
    }
    
    public Vertex getV2(){
	return v2;
    }


    public double distance(){
	return v1.distance(v2);
    }


    public int compareTo(Edge a){
	if(v1.distance(v2) < a.v1.distance(a.v2))
	    return 1;
	else if (v1.distance(v2) == a.v1.distance(a.v2))
	    return -1;
	else
	    return 0;
	
    }
}


