package graph;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collections;
import java.util.Scanner;

import graph.model.*;


public class Kruskal{
    private ArrayList<Vertex> vertexList;
    private ArrayList<Edge>   edgeList;

    public Kruskal(){
	vertexList = new ArrayList<Vertex>();
	edgeList   = new ArrayList<Edge>();
    }

    public ArrayList<Edge> getEdgeList(){
	return edgeList;
    }

    public ArrayList<Vertex> getVertexList(){
	return vertexList;
    }


    public void readFile(String name) throws IOException {
	File    fichier = new File(name);
	Scanner reader  = new Scanner(fichier);
		
	while(reader.hasNextInt()) {
	    vertexList.add(new Vertex(reader.nextInt(), reader.nextDouble(), reader.nextDouble()));
	}
    }


    public void Buildedgess() {
	int i, j, n;
	n = vertexList.size();
	for (i = 0; i < n - 1; i++)
	    for (j = i + 1; j < n; j++)
		edgeList.add(new Edge(vertexList.get(i), vertexList.get(j)));
    }

    /**
     * Kruskal(G, w) :
     * 1   A := vide                                                           +
     * 2   pour chaque sommet v de G :                                         +
     * 3      creerEnsemble(v)                                                 +
     * 4   trier les aretes de G par ordre croissant de poids w                +
     * 5   pour chaque arete (u, v) de G prise par ordre de poids croissant :  +
     * 6      si find(u) != find(v) :                                          +
     * 7         ajouter l'arete (u, v) a l'ensemble A                         +
     * 8         union(u, v)                                                   //problem??
     * 9   retourner A
     */

    public ArrayList<Edge> kruskal(){
	ArrayList<Vertex> S   = new ArrayList<Vertex>();
	ArrayList<Edge>   A   = new ArrayList<Edge>();
	Edge              tmp = new Edge();


	//Iterator<Edge> it = edgeList.iterator();
	Collections.sort(edgeList); 
	tmp = edgeList.get(1);

	A.add(tmp);
	for(int i=1; i < edgeList.size(); ++i){
	    tmp = edgeList.get(i);
	    
	    if( S.contains(tmp.getV1()) != S.contains(tmp.getV2())){
		S.add(tmp.getV1());
		S.add(tmp.getV2());
		A.add(tmp);
	    }
	}
	return A;
    }
    
}


