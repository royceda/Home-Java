import graph.model.Vertex;
import graph.model.Edge;
import graph.Kruskal;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;

public class Main{

    public static void main(String[] args) throws IOException {

	System.out.println("file: "+args[0]);
	Kruskal graph = new Kruskal();
	graph.readFile(args[0]);
	graph.buildEdge();
	ArrayList<Edge> edges = graph.kruskal();



	System.out.println("Aretes de l'arbre couvrant de poids minimum : ");
	for (Edge e : edges  ) System.out.println(e.getV1().getNumber() + ", " +
						     e.getV2().getNumber() );
	


    }
}
