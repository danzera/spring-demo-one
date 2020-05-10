package springdemo;
// helper class import
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		// load the Spring configuration file
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrieve Beans from Spring container
		Coach basketballCoach = context.getBean("basketballCoach", Coach.class);
		Coach baseballCoach = context.getBean("baseballCoach", Coach.class);
		Coach trackCoach = context.getBean("trackCoach", Coach.class);
		
		// call methods on the bean
		System.out.println(basketballCoach.getDailyWorkout());
		System.out.println(baseballCoach.getDailyWorkout());
		System.out.println(trackCoach.getDailyWorkout());
		
		// close the context
		context.close();
	}

}
