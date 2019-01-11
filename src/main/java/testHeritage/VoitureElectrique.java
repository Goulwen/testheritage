package testHeritage;

public class VoitureElectrique extends Voiture {

	public VoitureElectrique() {
		System.out.println("Constructeur voiture electrique");
	}
	
	@Override
	public void demarre() {
		System.out.println("Debut Demarre voiture electrique");
		super.demarre();
		System.out.println("Fin Demarre voiture electrique");
	}
}
