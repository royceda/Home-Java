import graph.model.*;
import graph.Kruskal;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;

public class Main{

    public static void main(String[] args) throws IOException {

	Kruskal graph = new Kruskal();
	graph.readFile(args[1]);
	ArrayList<Edge> edges = graph.kruskal();
    }
}
