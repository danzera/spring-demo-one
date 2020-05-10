package springdemo;

// add "implements Coach" to include Coach interface
public class BaseballCoach implements Coach {
	
	@Override // need to add this b/c we are overriding the Coach interface method
	public String getDailyWorkout() {
		return "Spend 30 minutes on batting practice";
	}

}
