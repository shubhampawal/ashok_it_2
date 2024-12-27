package in.spring;

public class Car {
 private IEngin engin;
  public Car() {
	// TODO Auto-generated constructor stub
}
 public void setEngin(IEngin engin) {
	 this.engin=engin;
	 
 }
 public Car(IEngin engin) {
	 System.out.println("Car :: constructor");
	this.engin=engin;
}
 public void drive() {
	int status=engin.start();
	if(status==1)
		System.out.println("HAppy journy..");
	else
		System.out.println("trooble in Engine..");
   
}
}
