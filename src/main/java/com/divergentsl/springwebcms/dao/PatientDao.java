package com.divergentsl.springwebcms.dao;

import java.util.List;

import com.divergentsl.springwebcms.entity.Patient;

public interface PatientDao<T> {

	public void insert(T patient);

	public Patient find(int id);

	public List<T> findAll();

	public void remove(int id);


	
}