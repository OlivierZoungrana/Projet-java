package etudiant;

public class Etudiant {
	
	private String nom;
	
	public Etudiant(String nom) {
		this.nom=nom;
	}
	
	public void Travailler() {
		 System.out.println(this.nom + " se met au travail !");
		 
	}
	public void Sereposer() {
		System.out.println(this.nom + " se repose !");
	}
}
//essaie