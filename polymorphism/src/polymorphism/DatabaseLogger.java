package polymorphism;

public class DatabaseLogger extends BaseLogger{
	public void log(String message) {
		System.out.println("Database logged " + message);
	}
}
