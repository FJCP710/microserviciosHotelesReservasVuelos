package com.curso.service;

import java.util.List;

import com.curso.model.Reserva;
import com.curso.model.ReservaAux;

/**
 * @author FJCP
 *
 */
public interface ReservasService {

	/**
	 * @param reserva
	 * @param personas
	 */
	void altaReservas(Reserva reserva, int personas);
	
	/**
	 * @param nombre_hotel
	 * @return
	 */
	List<ReservaAux> reservasExistentes(String nombre_hotel);
	
}
