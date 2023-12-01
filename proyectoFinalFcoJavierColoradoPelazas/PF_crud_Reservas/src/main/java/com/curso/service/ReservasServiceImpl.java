package com.curso.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curso.dao.ReservasDao;
import com.curso.model.Reserva;
import com.curso.model.ReservaAux;

@Service
public class ReservasServiceImpl implements ReservasService {

	@Autowired
	ReservasDao dao;

	/**
	 *
	 */
	@Override
	public void altaReservas(Reserva reserva, int personas) {
		dao.saveAndFlush(reserva);
		dao.actualizarPlazas(personas);
	}

	/**
	 *
	 */
	@Override
	public List<ReservaAux> reservasExistentes(String nombre_hotel) {
		List<ReservaAux> reducido = new ArrayList<>();
		
		for(Reserva r : dao.listadoReservasPorHotel(dao.buscarReservasPorId(nombre_hotel))) {
			
			reducido.add(new ReservaAux(r.getNombre(), r.getDni(), r.getIdVuelo()));
		}
		return reducido;
	}

	
	
}
