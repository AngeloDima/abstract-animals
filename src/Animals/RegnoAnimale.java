package Animals;

public class RegnoAnimale {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Animali tRex = new tRex();
		Animali coccoDrillo = new coccoDrillo();
		delfino delfino = new delfino();		
		
		
		System.out.println("T-Rex");
		tRex.dormi();
		tRex.mangia();
		tRex.verso();
		
		System.out.println("------------");
		
		System.out.println("coccoDrillo");
		coccoDrillo.dormi();
		coccoDrillo.mangia();
		coccoDrillo.verso();
		
		System.out.println("------------");
		System.out.println("Delfino");
		delfino.dormi();
		delfino.mangia();
		delfino.verso();
		
	}

}
