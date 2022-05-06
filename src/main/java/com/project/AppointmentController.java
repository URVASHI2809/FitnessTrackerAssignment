package com.project;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.project.models.Appointment;

@RestController
@RequestMapping("/appointment")
public class AppointmentController {
	
	@Autowired
	AppointmentService service;
	
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	void createAppointment(@RequestBody Appointment appointment) {
		System.out.println("Appointment request has been received successfully!!");
		service.saveAppointment(appointment);
	}
	
	@GetMapping("getdetails")
	List<Appointment> getAppoinment() {
		return service.getAllAppointments();
	}
}
