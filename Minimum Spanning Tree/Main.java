import graph.model.*;
import graph.Kruskal;
import java.io.IOException;


public class Main{

    public static void main(String[] args) throws IOException {

	Kruskal graph = new Kruskal();
	graph.readFile(args[1]);

    }
}
