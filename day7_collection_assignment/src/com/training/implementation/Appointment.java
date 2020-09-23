package com.training.implementation;

import java.util.*;
import com.training.entity.Doctor;
import com.training.entity.Patient;
import com.training.ifaces.AppointmentServices;

public class Appointment implements AppointmentServices {
	HashMap<Doctor,List <Patient>> appointmentList = new HashMap<Doctor,List <Patient>>();
	
	
	@Override
	public boolean addAppointment(Doctor doctor,List <Patient> patient) {
		if(appointmentList.containsKey(doctor)) {
		appointmentList.put(doctor, (List<Patient>) patient);
		
		}
		else {
			appointmentList.put(doctor, patient);
		}
		return true;
	}


	@Override
	public List<Patient> getAppointments(Doctor doctor) {
		if(appointmentList.containsKey(doctor)) {
		return appointmentList.get(doctor);
		}
		else {
			
			return null;
		}
	}


	@Override
	public boolean removeAppointment(Doctor doctor, Patient patient) {
		if(appointmentList.remove(doctor)!=null)
		{
			return true;
		}else {
		return false;
		}
	}
	
	
	


	
	
}
