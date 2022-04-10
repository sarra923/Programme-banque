
public class Compte {
	
	static public String nomTitulaire;
	static public double numCompte;
	static public double solde;
	static public double decouvert;

	
	public Compte (String nomTitulaire2, double numCompte2, double solde2) {
		nomTitulaire = nomTitulaire2;
		numCompte = numCompte2;
		solde = solde2;
	}
	
	static public void afficheSolde () {
		System.out.println("Voivi le solde du compte " + solde + " �");
	}
	
	static public void depot (double montant) {
		solde = solde + montant;
	}
	
	static public void retrait (double montant) {
		solde = solde - montant;
	}
	

	
	


}
