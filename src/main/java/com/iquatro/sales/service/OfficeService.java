package com.iquatro.sales.service;

import java.util.List;

import com.iquatro.sales.modelo.Office;

public interface OfficeService {

	public List<Office> findAll();
	public Office findById(Long id);

	
}
