package com.example.springboot;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CrewmateResource {

	@Autowired
	CrewmateRepository repo;

	@GetMapping("crewmates")
	public List<Crewmate> getCrewmates() {

		List<Crewmate> crewmates = (List<Crewmate>) repo.findAll();

		return crewmates;
	}
}
