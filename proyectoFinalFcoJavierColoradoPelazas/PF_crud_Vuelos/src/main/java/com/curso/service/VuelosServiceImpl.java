package com.curso.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curso.dao.VuelosDao;
import com.curso.model.Vuelo;

/**
 * @author Admin
 * Implementación de servicio de Vuelos
 */
@Service
public class VuelosServiceImpl implements VuelosService {

	@Autowired
	VuelosDao dao;
	
	/**
	 * return vuelosDisponibles desde dao
	 */
	@Override
	public List<Vuelo> vuelosDisponibles(int plazas) {
		return dao.vuelosDisponibles(plazas);
	}

	/**
	 * actualizarVuelo desde dao
	 */
	@Override
	public void actualizarVuelo(int idVuelo, int plazas) {
		dao.actualizarVuelo(idVuelo, plazas);
	}

}
