/* Programmeurs: Duy Ngyen Le [aka] Asian guy  
 * Giovanni E. Desroches [aka] Code God

	Date: 21 Octobre 2015
	Version: 2.0.1
*/

import java.util.ArrayList;


// classe pour la plupart des methodes et autres
public class Gestion{
	//tableaux pour chaque type d'objet & attributs
	static public ArrayList<Employe> employes = new ArrayList <Employe>();
	static public ArrayList<Benevole> benevoles = new ArrayList <Benevole>();
	static public ArrayList<Donateur> donateurs = new ArrayList<Donateur>();
	static public ArrayList<Don> dons = new ArrayList<Don>();
	static public int personnesAjoutees;
	static boolean type;
	
	//mehtode pour trouver employe 
	static public Employe trouverEmploye(int code)
	{
		Employe unEmploye = null;
		for(Employe elem: employes)
		{
			if(elem.getCode()==code)
			{
				unEmploye = elem;
			}
		}
		return unEmploye;
	} 
	//methode retournant donateur
	static public Donateur trouverDonateur(int code)
	{
		Donateur unDonateur = null;
		for(Donateur elem: donateurs)
		{
			if(elem.getCode()==code)
			{
				unDonateur = elem;
			}
		}
		return unDonateur;
	}
	//methode pour enlever un benevole 
	static public void retirer(int type, int unCode)
	{
				for(Benevole elem: benevoles)
				{
					if(elem.getCode()==unCode);
						benevoles.remove(elem);
						personnesAjoutees=personnesAjoutees-1;
				}
	}
	//methode pour ajouter employe au tableau
	static public void addEmploye(Employe exploite)
	{
		employes.add(exploite);
		personnesAjoutees++;
	}
	//methode pour ajouter benevole
	static public void addBenevole(String unNom, String unPrenom, String uneAdresse, String unTelephone)
	{
		Benevole benevole = new Benevole(unNom,unPrenom,uneAdresse,unTelephone);
		benevoles.add(benevole);
		personnesAjoutees=personnesAjoutees+1;
	}
	//methode pour ajouter donateur
	static public void addDonateur(String unNom, String unPrenom, String uneAdresse, String unTelephone)
	{
		Donateur donateur = new Donateur(unNom,unPrenom,uneAdresse,unTelephone);
		donateurs.add(donateur);
		personnesAjoutees++;
	}
	//methode pour ajouter don
	static public void addDon(String nature, String date, String livraison, int quantite,double montant,Donateur unDonateur)
	{
		Don unDon = new Don(nature,date,livraison,quantite,montant,unDonateur);
		dons.add(unDon);	
	}
	//methode pour definir liste d'emplooyes
	static public String getListeEmploye()
	{
		String listeEmployes="";
		
		for(Employe elem: employes)
		{
			listeEmployes += elem.getPrenom()+" "+elem.getNom()+"\n";
			
		}
		return listeEmployes;
	}
	//methode pour definir liste des benevoles
	static public String getListeBenevoles()
	{
		String listeBenevoles="";
		
		for(Benevole elem: benevoles)
		{
			listeBenevoles += elem.getPrenom()+" "+elem.getNom()+"\n";
			
		}

		return listeBenevoles;
	}
	//methode pour definir liste des donateurs
	static public String getListeDonateur()
	{
		String listeDonateurs="";
		
		for(Donateur elem: donateurs)
		{
			listeDonateurs += elem.getPrenom()+" "+elem.getNom()+"\n";
			
		}
		return listeDonateurs;
	}
	//methode pour calculer moyenne ds dons et la retourner
	static public double getMoyenneDons(){
		double moyenneDon=0;
		
		for(Don elem:dons){
			moyenneDon+=elem.getMontant();
		}
		return moyenneDon/dons.size();
	}
	//methode pour calculer totals dons et le retourner
	static public double getTotalDons(){
		double totalDons=0;
		
		for(Don elem:dons){
			totalDons+=elem.getMontant();
		}
		return totalDons;
	}
	//methode pour identifer dontauer ou benevole pour formulaire
	static boolean iType(boolean t){
		type=t;
		return type;
	}

}
