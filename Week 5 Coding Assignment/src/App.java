
public class App {

	public static void main(String[] args) {
		
		Logger logger = new AsteriskLogger();
		logger.Log("Hello");
		
		Logger logger2 = new AsteriskLogger();
		logger2.Error("Goodnight");
		
		Logger logger3 = new SpacedLogger();
		logger3.Log("Goodmorning");
		
		Logger logger4 = new SpacedLogger();
		logger4.Error("Goodbye");

	}

}
