package com.acmalist.acma.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
	
	@GetMapping("/tasks")
	public List<Tasks> listaTasks() {
		return tasksRepository.findAll();
	}

	@PostMapping("/tasks")
	public Tasks saveList(@RequestBody Tasks tasks) {
		return tasksRepository.save(tasks);
	}

	@DeleteMapping("/tasks/{id}")
	public String deleteList(@PathVariable(value="id") short id) {
		tasksRepository.deleteById(id);
	 	 return ("DELETE SUCESS");
	}
	
	@PutMapping("/tasks")
	public Tasks updateList(@RequestBody Tasks Tasks) {
	 	return tasksRepository.save(Tasks);
	}

	
}
