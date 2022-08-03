package com.idat.Bodega.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.idat.Bodega.service.BodegaService;


@RestController
@RequestMapping("/api/bodega/v1")
public class BodegaController {

	@Autowired
	private BodegaService service;

	
	@GetMapping("/asignar")
	public @ResponseBody void asignarProductosBodega() {
		service.asignarProductosBodega();
	}
}
