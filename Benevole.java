/* Programmeurs: Duy Ngyen Le [aka] Asian guy  
 * Giovanni E. Desroches [aka] Code God

	Date: 21 Octobre 2015
	Version: 2.0.1
*/
//classe pour objets benevole
public class Benevole extends Personnel{
//constructeurs
	public Benevole(String unNom, String unPrenom, String uneAdresse, String unTelephone){
		super(unNom,unPrenom,uneAdresse,unTelephone,Gestion.personnesAjoutees + 1);
	}

	//0 parametres
	public Benevole(){
		this("","","","");
	}
}
