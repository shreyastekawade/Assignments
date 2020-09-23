package com.training.main;

import java.util.ArrayList;

import java.util.List;

import com.training.entity.Doctor;

import com.training.entity.Patient;
import com.training.implementation.Appointment;

public class Application {
	
	public static void main(String[] args) {
		Appointment appointHandler = new Appointment();
		Doctor doctor1 = new Doctor("Ram");
		Patient patient1 = new Patient("Shreyas", "A+", 22);
		Patient patient2 = new Patient("Abhi", "B+", 22);
		List <Patient> patientList1 = new ArrayList<Patient>();
		patientList1.add(patient1);
		patientList1.add(patient2);
		
		
		appointHandler.addAppointment(doctor1, patientList1);
		
		
		System.out.println(appointHandler.getAppointments(doctor1));
		
		appointHandler.removeAppointment(doctor1, patient1);
		
		
		System.out.println(appointHandler.getAppointments(doctor1));
		
		Doctor doctor2 = new Doctor("Rakesh");
		Patient patient21 = new Patient("Shreyas1", "AB+", 22);
		Patient patient22 = new Patient("Abhi1", "0+", 22);
		List <Patient> patientList2 = new ArrayList<Patient>();
		patientList2.add(patient21);
		patientList2.add(patient22);
		
		
		appointHandler.addAppointment(doctor2, patientList2);
		
		
		System.out.println(appointHandler.getAppointments(doctor2));
		
		appointHandler.removeAppointment(doctor2, patient22);
		
		System.out.println(appointHandler.getAppointments(doctor2));

	}

}
