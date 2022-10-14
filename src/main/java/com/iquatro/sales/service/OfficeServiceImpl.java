package com.iquatro.sales.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.iquatro.sales.dao.OfficeDao;
import com.iquatro.sales.modelo.Office;

@Service
public class OfficeServiceImpl implements OfficeService {

	@Autowired
	private OfficeDao officeDao;

	@Override
	@Transactional(readOnly = true)
	public List<Office> findAll() {
		return (List<Office>) officeDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Office findById(Long id) {
		return  officeDao.findById(id).orElse(null);
	}

}
