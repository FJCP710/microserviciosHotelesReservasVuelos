package com.curso.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.curso.model.Vuelo;
import com.curso.service.VuelosService;

/**
 * @author FJCP
 * Clase controlador de Vuelos
 */
@RestController
public class VuelosController {

	@Autowired
	VuelosService service;
	
	// localhost:9000/vuelos/{plazas}
	/**
	 * @param plazas
	 * @return vuelosDisponibles desde servicio
	 */
	@GetMapping(value="vuelos/{plazas}", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Vuelo> vuelosDisponibles(@PathVariable("plazas") int plazas) {
		return service.vuelosDisponibles(plazas);
	}
	
	// localhost:9000/vuelos/{idVuelo}/{plazas}
	/**
	 * @param id_vuelo
	 * @param plazas
	 * actualizarVuelo desde servicio
	 */
	@PutMapping(value = "vuelos/{idVuelo}/{plazas}")
	public void actualizarVuelo(@PathVariable("idVuelo") int idVuelo, @PathVariable("plazas") int plazas) {
		service.actualizarVuelo(idVuelo, plazas);
	}
	
}
