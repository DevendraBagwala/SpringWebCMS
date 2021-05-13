package com.divergentsl.springwebcms.sevice;

import java.util.List;

import com.divergentsl.springwebcms.entity.Drug;

public interface DrugService {

	public Drug insertDrug(Drug drug);

	public Drug findDrug(int id);

	public List<Drug> findAllDrug();

	public void removeDrug(int id);
}
