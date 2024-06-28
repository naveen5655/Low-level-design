package naveen.Problem;

import java.util.*;

// Subject
public class YoutubeChannel {
	
	private final String name;
	private ArrayList<Subscriber> subscribers;
	private ArrayList<String> videos;
	
	
	YoutubeChannel(String name){
		this.name = name;
		this.subscribers = new ArrayList<>();
		this.videos = new ArrayList<>();
		
	}
	
	public void subsribe(Subscriber subscriber){
		this.subscribers.add(subscriber);
	}
	
	public void unSubscribe(Subscriber subscriber) {
		this.subscribers.remove(subscriber);
		
	}
	
	public void addVideo(String name) {
		this.videos.add(name);
	}

	public ArrayList<Subscriber> getSubscribers(){
		return this.subscribers;
	}
	

}
