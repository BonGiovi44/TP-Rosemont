/* Programmeurs: Duy Ngyen Le [aka] Asian guy  
 * Giovanni E. Desroches [aka] Code God

	Date: 21 Octobre 2015
	Version: 2.0.1
*/
//classe mère pour employe donateur et benevole
public class Personnel {
	//attributs
	private String nom, prenom, adresse, telephone;
	private int code;
	//constructeur
	public Personnel(String nom, String prenom, String adresse,
			String telephone, int code){
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.telephone = telephone;
		this.code = code;
	}
//getter&setters
	//methode pur obtenir nom de famillle
	public String getNom() {
		return nom;
	}
	//methode pour modifier nomde famille
	public void setNom(String nom) {
		this.nom = nom;
	}
	//methode pour obtenir le prenom
	public String getPrenom() {
		return prenom;
	}
	//methode pour modifer prenom
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	//methode pour obtenir adresse
	public String getAdresse() {
		return adresse;
	}
	//methode pour modifier adresse
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	//methode pour obtenir telephone
	public String getTelephone() {
		return telephone;
	}
	//methode pour modifier tel
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	//methode pour obtenir code
	public int getCode() {
		return code;
	}
	//methode pour modifier code
	public void setCode(int code) {
		this.code = code;
	}
	
}
