package com.spring.kalai.topic;

//import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	
	@Autowired
	private TopicService topicservice;
	
	@RequestMapping("/topics")
	public List<Topic> getAllTopic() {//it calls the function and converts the array as a JSON as a key:value pair.
		return topicservice.getAllTopics();
	}
	@RequestMapping("/topics/{id}")//GET
	public Topic getTopic(@PathVariable String id) {
		return topicservice.getTopic(id);
	}
	
	@PostMapping( value="/topics",consumes = MediaType.APPLICATION_JSON_VALUE)//post
	public  void addTopic(@RequestBody Topic topic) {
		 topicservice.addTopic(topic);
		 System.out.println(topic);
	}
	
	@DeleteMapping(value="/topics/{id}" )//DELETE
	public void DeleteTopic(@PathVariable String id ) {
		topicservice.DeleteTopic(id);	
	}

}