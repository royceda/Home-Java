package graph;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import graph.model.*;


public class Kruskal{
    private ArrayList<Vertex> vertexList;
    

    public Kruskal(){
	vertexList = new ArrayList<Vertex>();
    }

    public void readFile(String name) throws IOException {
	File    fichier = new File(name);
	Scanner reader  = new Scanner(fichier);
		
	while(reader.hasNextInt()) {
	    vertexList.add(new Vertex(reader.nextInt(), reader.nextInt(), reader.nextInt()));
	}
    }

    public static void main(String[] args){



    }
}
