package graph;

import java.util.List;
import java.util.ArrayList;


public Kruskal{
    private Arraylist<Vertex> vertexList;
    
    public void readFile(String name) throws IOException {
	File    fichier = new File(name);
	Scanner reader  = new Scanner(fichier);
		
	while(reader.hasNextInt()) {
	    sommets.add(new Sommet(reader.nextInt(), reader.nextInt(), reader.nextInt()));
	}
    }



}
