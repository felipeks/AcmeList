package com.acmalist.acma.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.acmalist.acma.models.Tasks;
import com.acmalist.acma.repository.TasksRepository;

@RestController
@RequestMapping(value="api/")
public class TasksResource {

	@Autowired
	TasksRepository tasksRepository;
	
	@DeleteMapping("/tasks/{id}")
	public String deleteListasks(@PathVariable(value="id") short id) {
		tasksRepository.deleteById(id);
	 	 return ("DELETE SUCESS");
	}
	
	@GetMapping("/tasks")
	public List<Tasks> listaTasks() {
		return tasksRepository.findAll();
	}
	@PostMapping("/tasks/{id}")
	public Tasks saveListTasks(@RequestBody Tasks tasks) {
		
		return tasksRepository.save(tasks);
	}
	
}
