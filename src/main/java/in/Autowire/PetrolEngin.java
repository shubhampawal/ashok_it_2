package in.Autowire;

public class PetrolEngin implements IEngin {
public PetrolEngin() {
	System.out.println("PetrolEngin :: Constructor");
}

@Override
public int start() {
	// TODO Auto-generated method stub
	System.out.println("PetrolEngine will be used");
	return 1;
}

}
