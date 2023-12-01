package com.curso.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * @author FJCP
 * Clase modelo de Reservas
 */
@Entity
@Table(name="reservas")
public class Reserva {
	
	@Id @Column(name="id_reservas")
	private int idReservas;
	private String nombre;
	private String dni;
	
	@Column(name="id_hotel")
	private int idHotel;
	
	@Column(name="id_vuelo")
	private int idVuelo;
	
	public Reserva() {
		super();
	}
	
	public Reserva(String nombre, String dni, int idVuelo) {
		super();
		this.nombre = nombre;
		this.dni = dni;
		this.idVuelo = idVuelo;
	}



	/**
	 * @param nombre
	 * @param dni
	 * @param idHotel
	 * @param idVuelo
	 */
	public Reserva(String nombre, String dni, int idVuelo, int idHotel) {
		super();
		this.nombre = nombre;
		this.dni = dni;
		this.idHotel = idHotel;
		this.idVuelo = idVuelo;
	}
	
	/**
	 * @return nombre
	 */
	public String getNombre() {
		return nombre;
	}
	
	/**
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	/**
	 * @return dni
	 */
	public String getDni() {
		return dni;
	}
	
	/**
	 * @param dni
	 */
	public void setDni(String dni) {
		this.dni = dni;
	}
	
	/**
	 * @return idHotel
	 */
	public int getIdHotel() {
		return idHotel;
	}
	
	/**
	 * @param idHotel
	 */
	public void setId_hotel(int idHotel) {
		this.idHotel = idHotel;
	}
	
	/**
	 * @return idVuelo
	 */
	public int getIdVuelo() {
		return idVuelo;
	}
	
	/**
	 * @param idVuelo
	 */
	public void setIdVuelo(int idVuelo) {
		this.idVuelo = idVuelo;
	}
	
	/**
	 * @return idReservas
	 */
	public int getIdReservas() {
		return idReservas;
	}
}
