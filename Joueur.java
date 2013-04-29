
public class Joueur {

	private String nom;//Nom du joueur 
	private int score;//Score du joueur
	private boolean passeTour;// Pour determiner l'etat du joueur , s'il a pass� son tour 
	
	/* Constructeur permettant de cr�er un joueur 
	 * 
	 * */

	public Joueur(String nom){
		
		this.nom = nom;
		this.score = 0;
		passeTour = false;
		
	}
	//GETTERS
	Joueur getJoueur(){
		
		return this.getJoueur();
		
	}
	public String getNom(){
		return nom;
	}
	
	int getScore(){
		return this.score;
	}
	/** retourne l'�tat du joueur 
	 * return true si le joueur a pass� son dernier tour,
	 * sinon  false 
	 */
	public boolean estPasse(){
		
		return passeTour;
	}
	//SETTERS
	
	//Pour changer le nom du joueur
	public void setName(String nom){
		
		this.nom = nom;
	}
	//Pour modifier le tour du joueur pass�
	public void setPasseTour(boolean passeTour) {
		
		this.passeTour = passeTour;
	}
	
	//METHODE
	public String toString(){ 
		
		return " Le joueur : '" +this.getNom() + "' , avec: " +this.getScore();
		
			
	}
	
	
	
}
