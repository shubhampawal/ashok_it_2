package in.Autowire;

public class Car {
 private IEngin engin;

//public IEngin getEngin() {
//	return engin;
//}
//
//public void setEngin(IEngin engin) {
//	this.engin = engin;
//}
public  Car(IEngin engin) {
	// TODO Auto-generated constructor stub
	System.out.println("Car parameterised constructor");
	 this.engin=engin;
	
}
 
 public Car() {	super();
	 System.out.println("Car non arg-constructor");
	
}

public void drive(){
	int status=engin.start();
	if(status>0)
		System.out.println("Happy journy");
	else
		System.out.println("Engine in a trooble");
}
 
}
