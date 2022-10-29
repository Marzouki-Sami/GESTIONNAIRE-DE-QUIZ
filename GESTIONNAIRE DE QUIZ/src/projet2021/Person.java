package projet2021;

import java.util.Objects;
import java.util.Scanner;

public abstract class Person {

	private String nom;
	private String pnom;
	private String dateNaissance;
	private String cin;
	private String adr;
	final int CURRENT_YEAR=2021;
	
	public Person(String nom, String pnom, String dateNaissance, String cin, String adr) {
		super();
		this.nom = nom;
		this.pnom = pnom;
		this.dateNaissance = dateNaissance;
		this.cin = cin;
		this.adr = adr;
	}
	public Person() {
		nom = "";
		pnom = "";
		dateNaissance = "";
		cin = "";
		adr = "";
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPnom() {
		return pnom;
	}
	public void setPnom(String pnom) {
		this.pnom = pnom;
	}
	public String getDateNaissance() {
		return dateNaissance;
	}
	public void setDateNaissance(String dateNaissance) {
		this.dateNaissance = dateNaissance;
	}
	public String getCin() {
		return cin;
	}
	public void setCin(String cin) {
		this.cin = cin;
	}
	public String getAdr() {
		return adr;
	}
	public void setAdr(String adr) {
		this.adr = adr;
	}
	
	public String year()
	{
		return dateNaissance.substring(6);
	}
	
	public int age() {
		return(CURRENT_YEAR-Integer.parseInt((year())));
	}
	
	@Override
	public String toString() {
		return "nom=" + nom + "\nprénom=" + pnom + "\nage=" + dateNaissance + "\ncin=" + cin + "\nadr=" + adr +"\nage="+age();
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(cin);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return Objects.equals(cin, other.cin);
	}
	public void saisie() {
		
		@SuppressWarnings("resource")
		Scanner s=new Scanner(System.in);
		do {
			System.out.println("tapez votre nom :");
			nom=s.nextLine();
		}while(nom.isEmpty() || (!nom.contains("[a-zA-Z ]+") /*&& nom.contains(" ")*/));
		
		do {
			System.out.println("tapez votre prénom :");
			pnom=s.nextLine();
		}while(pnom.isEmpty() || (!pnom.contains("[a-zA-Z ]+") /*&& pnom.contains(" ")*/));
		
		do {
			System.out.println("tapez votre date de naissance :");
			dateNaissance=s.next();
		}while(dateNaissance.isEmpty() || (!nom.contains("[0-9/]+") /*&& dateNaissance.contains("/")*/));
		
		do {
			System.out.println("tapez votre CIN :");
			cin=s.next();
		}while(cin.isEmpty() || (!cin.contains("[0-9]+")));
		
		do {
			System.out.println("tapez votre Email :");
			adr=s.nextLine();
		}while(adr.isEmpty() || (!adr.contains("[a-zA-Z0-9@._]+") && nom.contains("-")));
	}
	
	
}
