package testHeritage;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("--- Manip sur v ---");
		Voiture v = new Voiture();
		v.demarre();
		
		//v.demarre(34); ne fonctionne pas
		//v.allumeGyrophare(); ne fonctionne pas
		//v.chercher(); ne fonctionne pas
		
		System.out.println("--- Manip sur vp ---");
		VehiculePrioritaire vp = new VehiculePrioritaire();
		vp.demarre();
		vp.demarre(51);
		vp.allumeGyrophare();
		
		//vp.chercher(); ne fonctionne pas
		
		System.out.println("--- Manip sur a ---");
		Ambulance a = new Ambulance();
		a.demarre();
		a.demarre(25);
		a.allumeGyrophare();
		a.chercher();
		
		System.out.println("--- Manip sur ve ---");
		VoitureElectrique ve = new VoitureElectrique();
		ve.demarre();
	}
}
