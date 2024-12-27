package in.spring;



import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//BeanFactory factory=new XmlBeanFactory(new ClassPathResource("/in/spring/Bean.xml"));
		//Car car=factory.getBean(Car.class);
          ApplicationContext context=new ClassPathXmlApplicationContext("/in/spring/Bean.xml");
          Car car =context.getBean(Car.class);
          car.drive();
          
          Car car1=context.getBean(Car.class);
          System.out.println(car.hashCode());
          System.out.println(car1.hashCode());
	}

}
