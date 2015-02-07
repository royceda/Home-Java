package graph.model;


public class Edge{
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
}
