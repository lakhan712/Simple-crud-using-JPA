package io.villain.BasicJPA.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.villain.BasicJPA.model.Topic;
import io.villain.BasicJPA.model.TopicRepository;

@Service
public class TopicService {
	@Autowired
	private TopicRepository topicRepo;

//	private List<Topic> topics = new ArrayList<>(
//			Arrays.asList(
//			new Topic("Java101", "Java", "Java Course"),
//			new Topic("Python102", "Python", "Python Course"),
//			new Topic("NodeJS103", "NodeJS", "NodeJS Course"))
//			);

	public List<Topic> getAllTopics() {
		// return topics;
		List<Topic> topics = new ArrayList<>();
		topicRepo.findAll().forEach(topics::add);

		return topics;
	}

	public Topic getTopic(String id) {
	 return  topicRepo.findById(id).get();
	}

	public String addTopic(Topic topic) {
		// topics.add(topic);
		topicRepo.save(topic);
		return "data is added";
	}

	public String updateTopic(String id, Topic topic) {
		// TODO Auto-generated method stub
		topicRepo.findById(id);
		topicRepo.save(topic);
		return "data is updated";
	}

	public String deleteTopic(String id) {
		// TODO Auto-generated method stub
		topicRepo.deleteById(id);
		return "data is removed";
	}

}
