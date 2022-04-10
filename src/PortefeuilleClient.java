
import java.util.*;
import java.util.ArrayList;

public class PortefeuilleClient {
	
	private ArrayList<CompteCourant> ListeComptes;
	private int nb = 3;
	
	
	public PortefeuilleClient()
	{
     ListeComptes  = new ArrayList<CompteCourant>();
	}
	
	
	public void ajouteobjet(int n)
	{
		for(int i=0;i<n;i++)
		{
			CompteCourant PP = new CompteCourant();
			ListeComptes.add(PP);
		}
	}
	
	public void CompteObjet()
	{
		int Taille;
		Taille = ListeComptes.size();
		System.out.println("Il y a " + Taille + " comptes qui ont étaient créer.");
		}
	
	public void affichtout()
	{
		System.out.println("Voici la liste des clients : ");
		ListIterator it = ListeComptes.listIterator();
		
		while(it.hasNext())
		{
			Object Obj = it.next();
			CompteCourant PP = (CompteCourant) Obj;
			PP.affich();
		}
		
	}
	
	public void AffectationDecouvert() {
		ListIterator it = ListeComptes.listIterator();
		
		while(it.hasNext())
		{
			Object Obj = it.next();
			CompteCourant Compte = (CompteCourant) Obj;
			Compte.attributionDecouvert();	
		}
	}
	
	public void ADecouvert() {
		double decouvertRecup, soldeRecup;
		
		ListIterator it = ListeComptes.listIterator();
		
		while(it.hasNext())
		{
			Object Obj = it.next();
			CompteCourant Compte = (CompteCourant) Obj;
			decouvertRecup = Compte.getDecouvert();
			soldeRecup = Compte.getSolde();
			if(soldeRecup < decouvertRecup) Compte.affich();
		}
	}
}