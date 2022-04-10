
public class UtiliseCompte {
	
	public static void main(String[] args) {
		
		Compte CompteDupond;
		
		CompteDupond = new Compte("Dupond", 1234, 450);
		
		/*CompteDupond.afficheSolde();
		CompteDupond.depot(500);
		CompteDupond.afficheSolde();
		CompteDupond.retrait(120);;
		CompteDupond.afficheSolde();*/

		CompteBis CompteMartin;
		
		CompteMartin = new CompteBis("Martin", 586, 500, 150);
		
		CompteMartin.afficheSolde();
		CompteMartin.retrait(200);
		CompteMartin.afficheSolde();
		CompteMartin.retrait(300);
		CompteMartin.afficheSolde();
		}

	}
