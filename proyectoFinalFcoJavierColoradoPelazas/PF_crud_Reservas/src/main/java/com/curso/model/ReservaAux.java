package com.curso.model;

/**
 * @author FJCP
 */
public class ReservaAux {
	private String nombre;
	private String dni;
	private int idVuelo;
	
	public ReservaAux() {
		super();
	}
	
	/**
	 * @param nombre
	 * @param dni
	 * @param idVuelo
	 */
	public ReservaAux(String nombre, String dni, int idVuelo) {
		super();
		this.nombre = nombre;
		this.dni = dni;
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
	 * @return idVuelo
	 */
	public int getIdVuelo() {
		return idVuelo;
	}
	
	/**
	 * @param idVuelo
	 */
	public void setId_vuelo(int idVuelo) {
		this.idVuelo = idVuelo;
	}
}
