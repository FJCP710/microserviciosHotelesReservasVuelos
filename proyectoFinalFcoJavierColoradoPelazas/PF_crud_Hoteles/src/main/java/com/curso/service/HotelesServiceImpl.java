package com.curso.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curso.dao.HotelesDao;
import com.curso.model.Hotel;

/**
 * @author FJCP
 * Implementación de servicio de Hoteles
 */
@Service
public class HotelesServiceImpl implements HotelesService{

	@Autowired
	HotelesDao dao;
	
	/**
	 * return listadoHoteles desde dao
	 */
	@Override
	public List<Hotel> listadoHoteles() {
		return dao.listadoHoteles();
	}

	/**
	 * return nombreHoteles desde dao
	 */
	@Override
	public String nombreHotel(int idHotel) {
		return dao.nombreHotel(idHotel);
	}

}
