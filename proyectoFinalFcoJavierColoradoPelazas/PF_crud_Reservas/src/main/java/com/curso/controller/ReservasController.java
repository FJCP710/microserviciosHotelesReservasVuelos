package com.curso.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.curso.model.Reserva;
import com.curso.model.ReservaAux;
import com.curso.service.ReservasService;

@RestController
public class ReservasController {
	
	@Autowired
	ReservasService service;
	
	// localhost:9001/reservas/{personas}
	@PostMapping(value="reservas/{personas}", produces = MediaType.APPLICATION_JSON_VALUE)
	public void altaReservas(@RequestBody Reserva reserva , @PathVariable("personas") int personas) {
		service.altaReservas(reserva, personas);
	}
	
	// localhost:9001/reservas/{nombre_hotel}
	@GetMapping(value="reservas/{nombre_hotel}", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<ReservaAux> reservasExistentes(@PathVariable("nombre_hotel") String nombre_hotel){
		return service.reservasExistentes(nombre_hotel);
	}

}
