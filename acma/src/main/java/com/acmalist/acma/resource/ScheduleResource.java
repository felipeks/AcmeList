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

import com.acmalist.acma.models.Schedule;
import com.acmalist.acma.repository.ScheduleRepository;

@RestController
@RequestMapping(value = "/api")
public class ScheduleResource {
	@Autowired
	ScheduleRepository scheduleRepository;

	@GetMapping("/schedule")
	public List<Schedule> listaSchedule() {
		return scheduleRepository.findAll();
	}

	@GetMapping("/schedule/{id}")
	public Schedule listaScheduleUnique(@PathVariable(value = "id") short id) {
		return scheduleRepository.findById(id);
	}

	@PostMapping("/schedule")
	public Schedule saveList(@RequestBody Schedule schedule) {
		return scheduleRepository.save(schedule);
	}

	@DeleteMapping("/schedule/{id}")
	public String deleteList(@PathVariable(value="id") short id) {
	 	 scheduleRepository.deleteById(id);
	 	 return ("DELETE SUCESS");
	}
	
	@PutMapping("/schedule")
	public Schedule updateList(@RequestBody Schedule schedule) {
	 	return scheduleRepository.save(schedule);
	}

	
}
