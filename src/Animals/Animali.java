package Animals;

public abstract class Animali {

	
	public void dormi() {
		System.out.println("Dormire: ZzZzZzZ");
	}

	public abstract void mangia();
	
	
	public abstract void verso();

	protected abstract void terra();

	protected abstract void nuoto();
		
	
}

interface animaleNuoto {
	void nuoto();
}

interface animaleTerra {
	void terra();
}

interface animaleAria {
	void volare();
}


