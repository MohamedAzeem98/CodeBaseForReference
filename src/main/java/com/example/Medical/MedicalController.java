package com.example.Medical;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MedicalController {
	@Autowired MedicalService ms;
	
	@GetMapping(value="/{a}/{b}/{c}")
	public int calculate(@PathVariable int a,@PathVariable int b,@PathVariable int c) {
		return a/b*c;
	}
	
	@PostMapping(value="/add")
	public MedicalVaccination addingUp(@RequestBody List<MedicalVaccination> mv) {
		return ms.addingUp(mv);
	}
	
	
	
	
	
	
	
	
	
	

}
