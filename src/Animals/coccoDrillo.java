package Animals;

public class coccoDrillo extends Animali implements animaleNuoto{

	@Override
	public
	void verso() {
	    System.out.println("Verso: e il coccoDrillo come fa? non c'è nessuno che lo sà");

	}
	
	public
	void mangia() {
	    System.out.println("Gnam Gnam, bona sto pesce");

	}
	
	public void nuoto() {
		// TODO Auto-generated method stub
		System.out.println("WOW STO QUASI NUOTANDO");
		
	}

	@Override
	public void terra() {
		// TODO Auto-generated method stub
		
	}
}
