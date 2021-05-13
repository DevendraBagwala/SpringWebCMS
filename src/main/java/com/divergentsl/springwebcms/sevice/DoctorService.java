package com.divergentsl.springwebcms.sevice;

import java.util.List;

import com.divergentsl.springwebcms.entity.Doctor;

public interface DoctorService {
	
	public Doctor insertDoctor(Doctor doctor);

	public Doctor findDoctor(int id);

	public List<Doctor> findAllDoctor();

	public void removeDoctor(int id);

}