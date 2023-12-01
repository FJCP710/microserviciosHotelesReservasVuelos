package com.curso.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.curso.model.Vuelo;

/**
 * @author Admin
 * Clase Dao de Vuelos
 */
public interface VuelosDao extends JpaRepository<Vuelo, Integer> {
	
	/**
	 * @param plazas
	 * @return vuelosDisponibles mediante Query
	 */
	@Query(value= "SELECT * FROM vuelos v Where v.plazas >= :plazas", nativeQuery = true)
	public List<Vuelo> vuelosDisponibles(@Param("plazas") int plazas);

	
	/**
	 * @param idVuelo
	 * @param plazas
	 * actualizarVuelo mediante Query
	 * @Modifying se utiliza para poder hacer otro tipo de query diferente a un Select
	 * @Transactional se utiliza para hacer un commit hacia la bd en caso de que la transacción sea exitosa
	 */
	@Transactional
	@Modifying
	@Query(value="UPDATE vuelos v set v.plazas = v.plazas-:plazas Where v.id_vuelos = :idVuelo", nativeQuery = true)
	public void actualizarVuelo(@Param("idVuelo") int idVuelo, @Param("plazas") int plazas);
}
