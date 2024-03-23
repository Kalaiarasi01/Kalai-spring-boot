package com.spring.kalai.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//import java.util.Optional;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	 private List<Topic> topics=new ArrayList<>(Arrays.asList(
			new Topic("102","Niresh","Interior"),
			new Topic("103","Nandhu","Student"),
			new Topic("104","Naveen","Engineer"),
			new Topic("105","Tamil","Teacher")
			));
	public List<Topic> getAllTopics(){
		return topics;
	}
	
	public Topic getTopic(String id) {
		return topics.stream().filter(t-> t.getId().equals(id)).findFirst().get();
	}

	public void addTopic(Topic topic) {
		topics.add(topic);
	}

	public void DeleteTopic(String id) {
		topics.removeIf(t->t.getId().equals(id));
	}

}
