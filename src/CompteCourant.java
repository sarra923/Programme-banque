
public class CompteCourant {
	
	private String nomTitulaire;
	private double numCompte;
	private double solde;
	private double decouvert;
	
	public String getNomTitulaire() {
		return nomTitulaire;
	}


	public void setNomTitulaire(String nomTitulaire) {
		this.nomTitulaire = nomTitulaire;
	}


	public double getNumCompte() {
		return numCompte;
	}


	public void setNumCompte(double numCompte) {
		this.numCompte = numCompte;
	}


	public double getSolde() {
		return solde;
	}


	public void setSolde(double solde) {
		this.solde = solde;
	}


	public double getDecouvert() {
		return decouvert;
	}


	public void setDecouvert(double decouvert) {
		this.decouvert = decouvert;
	}

	
	
	public CompteCourant() {
		nomTitulaire = Saisie.lire_String("Entrez un nom de titulaire :");
		numCompte = Saisie.lire_double("Entrer votre numero de compte :");
		solde = Saisie.lire_double("Entrez votre solde :");
		decouvert = 0;
	}
	
	
	public void attributionDecouvert() {
		int montant = Saisie.lire_int("Quel est le montant du decouvert :");
		decouvert = montant;
	}
	
	
	public void afficheSolde () {
		System.out.println("Voivi le solde du compte " + solde + " �");
	}
	
	
	public void depot (double montant) {
		solde = solde + montant;
	}
	
	
	 public void retrait (double montant) {
		double calcul;
		calcul = solde - montant ;
		if (calcul < decouvert) {
			System.out.println("Erreur");
		}
		else {
			solde = solde - montant;
		}
	}
	 
	public void affich()
	{
		System.out.println("Le nom du titulaire est : " + nomTitulaire);
		System.out.println("Le num�ro du compte est : " + numCompte);
		System.out.println("Le solde est de : " + solde);
		System.out.println("Le decouvert autoris� est de : " + decouvert);
		System.out.println();
	}

}
