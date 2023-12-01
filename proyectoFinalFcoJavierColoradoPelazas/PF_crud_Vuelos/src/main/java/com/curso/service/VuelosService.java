package com.curso.service;

import java.util.List;

import com.curso.model.Vuelo;

/**
 * @author FJCP
 *
 */
public interface VuelosService {

	/**
	 * @param plazas
	 * @return vuelosDisponibles
	 */
	public List<Vuelo> vuelosDisponibles(int plazas);
	
	/**
	 * @param idVuelo
	 * @param plazas
	 */
	public void actualizarVuelo(int idVuelo, int plazas);
}
