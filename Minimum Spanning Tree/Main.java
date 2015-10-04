package kruskal;

import java.io.IOException;

public class AppliKruskal {
	public static void main(String[] arg)  throws IOException { 
		 	Arbre kruskal = new Arbre(arg[0]);
		 	kruskal.afficher();
	   	}
}