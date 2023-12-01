package com.curso.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.curso.model.Hotel;

/**
 * @author FJCP
 * Clase Dao de Hoteles
 */
public interface HotelesDao extends JpaRepository<Hotel, Integer> {
	
	/**
	 * @return listadoHoteles mediante Query
	 */
	@Query(value="SELECT * FROM hoteles h Where h.disponible = 1" , nativeQuery=true)
	public List<Hotel> listadoHoteles();
	
	/**
	 * @param idHotel
	 * @return nombreHotel mediante Query
	 */
	@Query(value="SELECT h.nombre FROM hoteles h Where h.id_hoteles = :idHotel" , nativeQuery=true)
	public String nombreHotel(@Param("idHotel") int idHotel);
}
