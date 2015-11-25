/* Programmeurs: Duy Ngyen Le [aka] Asian guy  
 * Giovanni E. Desroches [aka] Code God

	Date: 21 Octobre 2015
	Version: 2.0.1
*/
import java.util.ArrayList;
//classe pour définir les méthodes du superviseur
public class Superviseur{
	
	Superviseur()
	{
	}
	//methode pour enregistrer un employe
	public void EnregistrerEmploye(String nom, String prenom, String couriel, String adresse,
			String numero, int heuresTravaille, int leTauxHoraire,int unSalaire){
		
		Employe exploite = new Employe(nom,prenom,couriel,adresse,numero,heuresTravaille,leTauxHoraire,unSalaire);
		Gestion.addEmploye(exploite);
	}
	
	//methode pour obtenir information desiree
	public String getInfo(int type)
	{
		String[] typeInformations = {"1. Liste employes","2. Liste benevoles",
				"3. Liste donateur","4. Moyenne des dons","5. Total des dons"};
		
		switch(type){
		//liste d'employes
			case 1:
				return Gestion.getListeEmploye();	
			case 2:
		//liste des benevoles	
				return Gestion.getListeBenevoles();
			case 3:
		//liste des donateurs		
				return Gestion.getListeDonateur();		
		//moyennes des dons
			case 4:
				return Double.toString(Gestion.getMoyenneDons());
		//total des dons
			case 5:
				return Double.toString(Gestion.getTotalDons());				
			default:
				break;
		}
		return  "";
	}
//getters & setter
	/*public String getNomUtilisateur() {
		return nomUtilisateur;
	}

	public void setNomUtilisateur(String nomUtilisateur) {
		this.nomUtilisateur = nomUtilisateur;
	}

	public String getMotDePasse() {
		return motDePasse;
	}

	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}
*/	
}
