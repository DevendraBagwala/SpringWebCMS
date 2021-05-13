package com.divergentsl.springwebcms.sevice;
import java.util.List;

import com.divergentsl.springwebcms.entity.Appointment;

public interface AppointmentService {
	
	public Appointment insertAppointment(Appointment appointment);

	public Appointment findAppointment(int id);

	public List<Appointment> findAllAppointment();

	public void removeAppointment(int id);
	

}
