import java.util.ArrayList;


public class Partie {
	
	ArrayList<Joueur> joueurs ;
	private String nomPartie;
	ArrayList<Board> plateau;
	private BagLetter bagletter;
	
	/** Creation d'une partie avec comme parametre le nom de la partie 
	 * 
	 */
	public Partie(){
		this.joueurs= new ArrayList<Joueur>();
		this.nomPartie="Partie par defaut";
		this.plateau = new ArrayList<Board>();
		this.bagletter = new BagLetter();
	}
	
	public Partie(String nomPartie,ArrayList<Joueur>joueurs){
		
		this.joueurs = joueurs;
		this.nomPartie = nomPartie;
		this.plateau = plateau;
		this.bagletter = new BagLetter();
		
	}
	/**
	 * Getters 
	 * @return Plateau de jeu et le Bagletter
	 */
	public ArrayList<Board> getPlateau() {
		
	return this.plateau;
	}
	
	public BagLetter BagLetter() {
		
		return this.bagletter;
	}
	/**Setters
	 *Pour definir le nom de la partie
	 */
	public void setNomPartie(String partie){
		nomPartie= partie;
	}
	public String getNomPartie(){
		return this.nomPartie;
	}
	/**
     * Ajoute un joueur au jeu
     * 
     * @param Joueur
     *            Le joueur ˆ ajouter.
     */
	
	public void ajouteJoueur(Joueur joueur) {
		joueur.add(joueur);
	}
	/**
	 * 
	 * Retourne le nombre des joueurs de l'ArrayList Joueur
	 * @param i 
	 */
	public int getNombreJoueur(int i)
	{
		return this.joueurs.size();
	}
	/**Method equals
	 * 
	 */
	public boolean equals(Object PV){
		boolean resultat = true;
		for (int i =0;i < joueurs.size(); i++) {
			resultat = resultat & joueurs.get(i).equals(((Partie)PV).getNombreJoueur(i));
			
		}
	return resultat;
	}
	/** ToString retournant le nom de la partie et l'indice du joueur
	 * 
	 */
	public String toString(){
		StringBuffer s = new StringBuffer("Partie : "+this.getNomPartie());
		for(int t=0;t<joueurs.size();t++){
		s.append("\t - Joueur n¡ "+t +":" + joueurs.get(t) + "\n");
		}
	
	return s.toString();
}
		
		
		

	}


