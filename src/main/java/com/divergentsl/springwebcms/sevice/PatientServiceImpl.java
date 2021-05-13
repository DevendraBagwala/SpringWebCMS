package com.divergentsl.springwebcms.sevice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.divergentsl.springwebcms.dao.PatientDao;
import com.divergentsl.springwebcms.entity.Patient;

@Service
public class PatientServiceImpl implements PatientService {

	@Autowired
	PatientDao patientDao;
	
	@Transactional
	@Override
	public void insert(int patientId, String patientName, String address) {
		
		Patient patient = new Patient();
		patient.setId(patientId);
		patient.setName(patientName);
		patient.setAddress(address);
		//patient.setContactNumber(contactNumber);		
		patientDao.insert(patient);
		
	}

	@Transactional(readOnly = true)
	@Override
	public List<Patient> findAll() {
		
		return patientDao.findAll();
	}
	@Override
	@Transactional(readOnly = true)
	public Patient find(int patientId) {
		return patientDao.find(patientId);
	}

	/*
	 * public void delete(int patientId) { patientDao.delete(patientId); }
	 */

	@Transactional
	@Override
	public void removePatient(int id) {
		patientDao.remove(id);
	}


	

	
}