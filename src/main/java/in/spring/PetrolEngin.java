package in.spring;

public class PetrolEngin implements IEngin {
	
	public PetrolEngin() {
		System.out.println("PetrolEngin:: Constructor");
	}

	@Override
	public int start() {
		
		return 1;
	}

}
