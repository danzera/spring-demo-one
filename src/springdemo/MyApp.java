package springdemo;

public class MyApp {

	public static void main(String[] args) {
		// create the object
		// reference the interface on the left
		Coach theCoach = new BaseballCoach();
		
		// use the object
		System.out.println(theCoach.getDailyWorkout());
	}

}
