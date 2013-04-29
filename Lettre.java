
public class Lettre {
	
	public char caractereLettre;
	
	public Lettre() 
	{
		this.caractereLettre =' ';
	}
	
	
	//GETTER
	
	char getChar() {
		return this.caractereLettre;
	}
	
	//METHODE
	public String toString() {
		return "Lettre : "+this.caractereLettre; 
	}
	
	public boolean equals (Object o) {
		 return (this.caractereLettre == ((Lettre)o).caractereLettre);
	}
	
}
