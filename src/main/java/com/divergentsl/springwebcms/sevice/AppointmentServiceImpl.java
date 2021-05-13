package com.divergentsl.springwebcms.sevice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.divergentsl.springwebcms.dao.AppointmentDao;
import com.divergentsl.springwebcms.entity.Appointment;

@Service
public class AppointmentServiceImpl implements AppointmentService {
	
	@Autowired
	AppointmentDao appointmentDao;

	@Override
	@Transactional
	public Appointment insertAppointment(Appointment appointment) {		
		return (Appointment)appointmentDao.insert(appointment);
	}

	@Override
	@Transactional(readOnly = true)
	public Appointment findAppointment(int id) {		
		return  (Appointment)appointmentDao.find(id);
	}

	@Override
	@Transactional(readOnly = true)
	public List<Appointment> findAllAppointment() {
		return appointmentDao.findAll();
	}

	@Override
	@Transactional
	public void removeAppointment(int id) {
		appointmentDao.remove(id);
		
	}

}