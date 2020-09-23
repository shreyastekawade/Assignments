package com.training.ifaces;
import java.util.*;
import com.training.entity.Doctor;
import com.training.entity.Patient;


public interface AppointmentServices {
	boolean addAppointment(Doctor doctor, List <Patient> patient);
	List<Patient> getAppointments(Doctor doctor);
	boolean removeAppointment (Doctor doctor, Patient patient );
}
