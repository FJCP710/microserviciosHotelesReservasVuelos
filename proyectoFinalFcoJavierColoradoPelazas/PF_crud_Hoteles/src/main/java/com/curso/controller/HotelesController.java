package com.curso.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.curso.model.Hotel;
import com.curso.service.HotelesService;

/**
 * @author FJCP
 * Clase controlador de Hoteles
 */
@RestController
public class HotelesController {

	@Autowired
	HotelesService service;
	
	/**
	 * @return listadoHoteles disponibles desde servicio
	 * localhost:8080/hoteles
	 */
	@GetMapping(value="hoteles", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Hotel> listadoHoteles(){
		return service.listadoHoteles();
	}
	
	/**
	 * @param idhotel
	 * @return nombreHotel por Id desde servicio
	 * localhost:8080/hoteles/{idhotel}
	 */
	@GetMapping(value="hoteles/{idhotel}", produces = MediaType.APPLICATION_JSON_VALUE)
	public String nombreHotel(@PathVariable("idhotel") int idHotel) {
		return service.nombreHotel(idHotel);
	}
	
}
