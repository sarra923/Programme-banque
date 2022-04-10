
public class UseComptes {

	public static void main(String[] args) {
		
		PortefeuilleClient mesClients = new PortefeuilleClient();
		mesClients.ajouteobjet(5);
		mesClients.CompteObjet();
		mesClients.affichtout();
		
		mesClients.AffectationDecouvert();
		mesClients.affichtout();
		
		mesClients.ADecouvert();
	}

}
