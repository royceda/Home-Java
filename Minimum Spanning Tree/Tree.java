package kruskal;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Tree {
	private ArrayList<Sommet> sommets = new ArrayList<Sommet>();
	private ArrayList<Arete> aretes = new ArrayList<Arete> ();

	public Tree(String nom) throws IOException {
		lireFichier(nom);
		kruskal();
	}
	
	public ArrayList<Sommet> getSommets() {
		return sommets;
	}

	public ArrayList<Arete> getAretes() {
		return aretes;
	}
	public void lireFichier(String nom) throws IOException {
		File fichier = new File(nom);
		Scanner lecteur = new Scanner(fichier);
		
		while(lecteur.hasNextInt()) {
			sommets.add(new Sommet(lecteur.nextInt(), lecteur.nextInt(), lecteur.nextInt()));
		}
	}
	ArrayList<Arete> construireToutesAretes() {
		int i, j, n;
		ArrayList<Arete> toutesAretes = new ArrayList<Arete> ();
		n = sommets.size();
		for (i = 0; i < n - 1; i++)
			for (j = i + 1; j < n; j++)
				toutesAretes.add(new Arete(sommets.get(i), sommets.get(j)));
		return toutesAretes;
	}
	
	public void  kruskal() {
		int i, n, num1, num2;
		Arete a;
		n = sommets.size();
		for (i = 0; i < n; i++)
			sommets.get(i).setCC(i);
		
		ArrayList<Arete> toutesAretes = construireToutesAretes();
		Collections.sort(toutesAretes);
		
		i = 0;
		while (aretes.size() < n - 1) {
			a = toutesAretes.get(i);
			num1 = a.getExtr1().getCC();
			num2 = a.getExtr2().getCC();
			if (num1 != num2) {
				aretes.add(a);
				for (Sommet s : sommets)
					if (s.getCC() == num2) s.setCC(num1);
			}
			i++;
		}
	}
	
	public void afficher() {
		System.out.println("Aretes de l'arbre couvrant de poids minimum : ");
		for (Arete a : aretes ) System.out.println(a.getExtr1().getNumero() + ", " +
				a.getExtr2().getNumero() );
	}
}