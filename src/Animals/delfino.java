package Animals;

public class delfino extends Animali implements animaleNuoto{

	@Override
	public
	void verso() {
	    System.out.println("Verso: IIIIII");

	}
	
	public
	void mangia() {
	    System.out.println("Gnam Gnam, bona st'acqua");

	}

	@Override
	public void nuoto() {
		// TODO Auto-generated method stub
		System.out.println("WOW STO NUOTANDO");
	}

	@Override
	public void terra() {
		// TODO Auto-generated method stub
		
	}
}
