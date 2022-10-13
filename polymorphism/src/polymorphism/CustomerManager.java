package polymorphism;

public class CustomerManager {
	private BaseLogger _baseLogger;

	public CustomerManager(BaseLogger baseLogger) {
		_baseLogger = baseLogger;
	}
	
	public void add() {
		_baseLogger.log("loglandı");
		System.out.println("Müşteri eklendi");
	}
	
}
