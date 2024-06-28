package naveen.Solution;

// Observer
public class Subscriber {
	
	private final String name;
	
	public Subscriber(String name) {
		this.name = name;	
	}
	
	public void notify(String message)
	{
		System.out.println("Hi "+this.name + ", "+ message);
	}

}
