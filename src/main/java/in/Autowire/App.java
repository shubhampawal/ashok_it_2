package in.Autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  ApplicationContext context=new ClassPathXmlApplicationContext("/in/Autowire/Bean1.xml");
  Car car= context.getBean(Car.class);
  car.drive();
	}

}
