package kruskal;

import java.awt.Graphics;

public class Edge implements Comparable<Vertex> {
	private Vertex extr1, extr2;

	public Edge(Vertex extr1, Vertex extr2) {
		this.extr1 = extr1;
		this.extr2 = extr2;
	}

	public Vertex getExtr1() {
		return extr1;
	}

	public Vertex getExtr2() {
		return extr2;
	}

	public double longueur() {
		int x1 = extr1.getAbs(), y1 = extr1.getOrd();
		int x2 = extr2.getAbs(), y2 = extr2.getOrd();
		return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
	}
	public int compareTo(Arete autre) {
		double l1 = this.longueur() , l2 = autre.longueur();
		if (l1 < l2) return -1;
		if (l1 > l2) return 1;
		return 0;
	}
}