package ca.uqtr.gl.domain;

import java.util.ArrayList;

import ca.uqtr.gl.entities.Article;
import ca.uqtr.gl.entities.Vente;

public class RegistreVente {
	private static ArrayList<Vente> listeVentes;
	
	public RegistreVente()
	{
		listeVentes = new ArrayList<Vente>();
	}
	public void ajouterVente(Vente vente)
	{
		listeVentes.add(vente);
	}
	
	public void supprimerVente(Vente vente)
	{
		listeVentes.remove(vente);
	}
	
	public Vente obtenirVenteParNumeroFacture(int numeroFacture)
	{
		for(Vente v : listeVentes)
		{
			if(v.getNumeroFacture() == numeroFacture)
			{
				return v;
			}
		}
		
		return null;
	}
}
