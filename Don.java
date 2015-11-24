/* Programmeurs: Duy Ngyen Le [aka] Asian guy  
 * Giovanni E. Desroches [aka] Code God

	Date: 21 Octobre 2015
	Version: 2.0.1
*/
//calsse pour les dons
public class Don{
	//attributs
	private String nature, date, livraison;
	private int quantite;
	private double montant;
	private Donateur donateur;
	//constructeurs
	public Don(String nature, String date, String livraison, int quantite,double montant,Donateur unDonateur){
		//this(nature,date,livraison,quantite,montant);
		this.nature = nature;
		this.date = date;
		this.livraison = livraison;
		this.quantite = quantite;
		this.montant = montant;
		this.donateur = unDonateur;
	}

	//methode pour lier don au donateur
	public void setDonateur(Donateur leDonateur)
	{
		this.donateur = leDonateur;
	}
	//methode pour changer le donateur
	public Donateur getDonateur()
	{		
		return donateur;
	}
	//methode pour obtenir nature
	public String getNature() {
		return nature;
	}
	//methode pour modifier nature
	public void setNature(String nature) {
		this.nature = nature;
	}
	//methode pour obetnir date
	public String getDate() {
		return date;
	}
	//methode pour modifier date
	public void setDate(String date) {
		this.date = date;
	}
	//methode pour obtenir livraison
	public String getLivraison() {
		return livraison;
	}
	//methode pour modifier livraison
	public void setLivraison(String livraison) {
		this.livraison = livraison;
	}
	//methode pour obtenir quantite
	public int getQuantite() {
		return quantite;
	}
	//methode pour modifeir quantite
	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}
	//methode pour obtenir montant/valeur
	public double getMontant() {
		return montant;
	}
	//methode pour modifier montant/valeur
	public void setMontant(double montant) {
		this.montant = montant;
	}


}
