package naveen.Problem;

public class Client {

	public static void main(String[] args) {
		YoutubeChannel channel1 = new YoutubeChannel("SportsTak.");
		YoutubeChannel channel2 = new YoutubeChannel("Daily Code");
		Subscriber subscriber1 = new Subscriber("Mohit");
		Subscriber subscriber2 = new Subscriber("Raina");
		Subscriber subscriber3 = new Subscriber("Dhoni");
		Subscriber subscriber4 = new Subscriber("Deepak");
		channel1.subsribe(subscriber1);
		channel1.subsribe(subscriber3);
		channel1.subsribe(subscriber4);
		channel2.subsribe(subscriber2);
		channel2.subsribe(subscriber4);
		channel1.addVideo("Design Pattern unleased in 10 mins.");
		channel1.getSubscribers().forEach(subscriber -> subscriber.notify(
				"New Video added with title: Design Pattern unleashed in 18 min."));
		channel2.addVideo("India won the worled cup by 23 runs");
		channel2.getSubscribers().forEach(subscriber -> subscriber.notify(
				"New Video added with tite: India won the world cup by 23 rus."
				));

	}

}
