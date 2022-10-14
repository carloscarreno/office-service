package com.iquatro.sales.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iquatro.sales.modelo.Office;
import com.iquatro.sales.service.OfficeService;

@RestController
@RequestMapping(path="/offices")
public class OfficeController {

	@Autowired
	private OfficeService officeService;

	@GetMapping("/listar")
	public List<Office> listar(){
		return officeService.findAll();
	}
	
	@GetMapping("/mostrar/{id}")
	public Office detalle(@PathVariable Long id) {
		return officeService.findById(id);
	}

}
