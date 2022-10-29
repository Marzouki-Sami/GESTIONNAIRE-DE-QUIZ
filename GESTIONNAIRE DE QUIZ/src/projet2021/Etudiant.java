package projet2021;

import java.util.Scanner;

public class Etudiant extends Person{
	
	private int grp;

	public Etudiant(String nom, String pnom, String dateNaissance, String cin, String adr, int grp) {
		super(nom, pnom, dateNaissance, cin, adr);
		this.grp = grp;
	}

	public Etudiant() {
		super();
		grp=0;
	}

	public int getgrp() {
		return grp;
	}

	public void setgrp(int grp) {
		this.grp = grp;
	}
	
	public void saisie() {
		Scanner s=new Scanner(System.in);
		super.saisie();
		do {
			System.out.println("tapez votre nom :");
			grp=s.nextInt();
		}while(grp==0);
	}
	
	public String toString() {
		return super.toString()+"\nnumero d'etudiant"+grp;
	}
	
}
