package com.curso.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.curso.model.Reserva;

/**
 * @author FJCP
 * Clase Dao de Reservas
 */
public interface ReservasDao extends JpaRepository<Reserva, Integer> {
	
	/**
	 * @param personas
	 */
	@Transactional
	@Modifying
	@Query(value="Update vuelos v set v.plazas = v.plazas-:personas", nativeQuery = true)
	void actualizarPlazas(@Param("personas") int personas);
	
	/**
	 * @param nombre_hotel
	 * @return
	 */
	@Query(value="Select h.id_hoteles from hoteles h where h.nombre = ?", nativeQuery = true)
	int buscarReservasPorId(String nombre_hotel);
	
	/**
	 * @param idHotel
	 * @return
	 */
	@Query(value="Select * from reservas r where r.id_hotel = :idHotel", nativeQuery = true)
	List<Reserva> listadoReservasPorHotel(@Param("idHotel") int idHotel);
	
}
