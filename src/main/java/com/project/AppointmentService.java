package com.project;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.project.models.Appointment;

@Service
public class AppointmentService {
	List<Appointment> repository = new ArrayList<>();
	
	void saveAppointment(Appointment appointment) {
		repository.add(appointment);
		System.out.println("Appointment details saved successfully!!");
	}
	
	List<Appointment> getAllAppointments() {
		return repository;
	}
}
