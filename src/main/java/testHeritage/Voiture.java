package testHeritage;

public class Voiture {

	private int vitesseInitiale;
	
	public Voiture() {
		System.out.println("Constructeur voiture");
	}
	
	public Voiture(int vitesseInitiale) {
		System.out.println("Constructeur vitesse initiale " + vitesseInitiale);
		this.vitesseInitiale = vitesseInitiale;
	}

	public void demarre() {
		System.out.println("Début Demarre");
		chauffeMoteur();
		System.out.println("Fin Demarre");
	}

	private void chauffeMoteur() {
		System.out.println("Chauffe moteur");
	}
}
