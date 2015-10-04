package kruskal;

import java.awt.Color;
import java.awt.Graphics;

public class Vertex {
	private int abs, ord, numero;
	private int CC;
	
	public Vertex(int numero, int abs, int ord) {
		this.numero = numero;
		this.abs = abs;
		this.ord = ord;
	}
	public int getNumero() {
		return numero;
	}	public int getCC() {
		return CC;
	}
	public void setCC(int cc) {
		CC = cc;
	}
	public int getAbs() {
		return abs;
	}
	public int getOrd() {
		return ord;
	}
}