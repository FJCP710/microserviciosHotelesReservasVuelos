package com.curso.service;

import java.util.List;

import com.curso.model.Hotel;

/**
 * @author FJCP
 *
 */
public interface HotelesService {
	
	/**
	 * @return listadoHoteles
	 */
	public List<Hotel> listadoHoteles();
	/**
	 * @param idHotel
	 * @return nombreHotel
	 */
	public String nombreHotel(int idHotel);
	
}
