
public class AsteriskLogger implements Logger{

	@Override
	public void Log(String log) {
		System.out.println("***" + log + "***");
		
	}

	@Override
	public void Error(String error) {
		System.out.println("**********" + topLineBottomLine(error) + "***");
		System.out.println("***Error: " + error + "***");
		System.out.println("**********" + topLineBottomLine(error) + "***");
	}
	
	public static String topLineBottomLine(String error) {
		int errorLength = error.length();
		String asterisk = "";
		for (int i = 0; i < errorLength; i++) {
			asterisk += "*";
		}
		return asterisk;
	}

}
