package testHeritage;

public class VehiculePrioritaire extends Voiture {
	
	public VehiculePrioritaire() {
		super(5);
	}

	public void allumeGyrophare() {
		System.out.println("Allume Gyrophare");
	}
	
	public void demarre(int code) {
		System.out.println("Demarre avec code : " + code);
	}
}
