/* Programmeurs: Duy Ngyen Le [aka] Asian guy  
 * Giovanni E. Desroches [aka] Code God

	Date: 21 Octobre 2015
	Version: 2.0.1
*/
//classe pour les objets Donateur
public class Donateur extends Personnel{
	//constructeurs
	public Donateur(String unNom, String unPrenom, String uneAdresse, String unTelephone){
		super(unNom,unPrenom,uneAdresse,unTelephone,Gestion.personnesAjoutees+1);
	}
	//0 parametres
	public Donateur(){
		this("","","","");
	}

}