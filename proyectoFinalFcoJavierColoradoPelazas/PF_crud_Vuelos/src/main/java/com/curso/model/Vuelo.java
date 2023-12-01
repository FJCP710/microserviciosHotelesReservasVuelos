package com.curso.model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * @author Admin
 * Clase Modelo de la tabla Vuelos
 */
@Entity
@Table(name="vuelos")
public class Vuelo {
	
	@Id @Column(name="id_vuelos")
	private int idVuelo;
	private String compania;
	private Date fecha_vuelo;
	private double precio;
	private int plazas;
	
	public Vuelo() {
		super();
	}
	
	/**
	 * @param id_vuelo
	 * @param compania
	 * @param fecha_vuelo
	 * @param precio
	 * @param plazas
	 */
	public Vuelo(int idVuelo, String compania, Date fecha_vuelo, double precio, int plazas) {
		super();
		this.compania = compania;
		this.fecha_vuelo = fecha_vuelo;
		this.precio = precio;
		this.plazas = plazas;
	}
	
	/**
	 * @return id_vuelo
	 */
	public int getIdVuelo() {
		return idVuelo;
	}
	
	/**
	 * @return compania
	 */
	public String getCompania() {
		return compania;
	}
	
	/**
	 * @param compania
	 */
	public void setCompania(String compania) {
		this.compania = compania;
	}
	
	/**
	 * @return fecha_vuelo
	 */
	public Date getFecha_vuelo() {
		return fecha_vuelo;
	}
	
	/**
	 * @param fecha_vuelo
	 */
	public void setFecha_vuelo(Date fecha_vuelo) {
		this.fecha_vuelo = fecha_vuelo;
	}
	
	/**
	 * @return precio
	 */
	public double getPrecio() {
		return precio;
	}
	
	/**
	 * @param precio
	 */
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	/**
	 * @return plazas
	 */
	public int getPlazas() {
		return plazas;
	}
	
	/**
	 * @param plazas
	 */
	public void setPlazas(int plazas) {
		this.plazas = plazas;
	}
}
