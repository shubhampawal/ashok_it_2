package in.Autowire;

public class DigelEngin implements IEngin {
  public DigelEngin() {
	// TODO Auto-generated constructor stub
	  System.out.println("DiselEngine :: Constructor");
}

@Override
public int start() {
	// TODO Auto-generated method stub
	System.out.println("DiselEngin will be used");
	return 1;
}
  
}
