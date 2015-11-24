/* Programmeurs: Duy Ngyen Le [aka] Asian guy  
 * Giovanni E. Desroches [aka] Code God

	Date: 21 Octobre 2015
	Version: 2.0.1
*/

//classe pour les objets employés
public class Employe extends Personnel {
	//attributs
	private String couriel;
	final private int tauxHoraire;
	private int heuresTravaille;
	private float salaire;
	
	//constructeurs
	public Employe(String nom, String prenom, String couriel, String adresse,
			String telephone, int heuresTravaille, int leTauxHoraire,float salaire){
		super(nom,prenom,adresse,telephone,Gestion.personnesAjoutees + 1);
		this.tauxHoraire = leTauxHoraire;
		this.heuresTravaille = heuresTravaille;
		this.salaire = salaire;
	}
	
		
// Getters & setters 
	//methode pour obtenir l'adresse courriel
	public String getCouriel() {
		return couriel;
	}
	//methode pour modifier l'adresse courriel
	public void setCouriel(String couriel) {
		this.couriel = couriel;
	}
	//methode pour obtenir le taux horaire
	public int getTauxHoraire() {
		return tauxHoraire;
	}
	//methode pour obtenir nombre d'heures travaillees
	public int getHeuresTravaille() {
		return heuresTravaille;
	}
	//methode pour modifier nombre d'heures travaillees
	public void setHeuresTravaille(int heuresTravaille) {
		this.heuresTravaille = heuresTravaille;
	}
	//methode pour retouner le salaire
	public float getSalaire(){
		return salaire;
	}
	
	
}
