package com.curso.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * @author FJCP
 * Clase Modelo de la tabla hoteles
 */
@Entity
@Table(name="hoteles")
public class Hotel {
	
	@Id @Column(name="id_hoteles")
	private int idHotel;
	private String nombre;
	private int categoria;
	private double precio;
	private boolean disponible;
	
	public Hotel() {
		super();
	}
	
	/**
	 * @param idHotel
	 * @param nombre
	 * @param categoria
	 * @param precio
	 * @param disponible
	 */
	public Hotel(int idHotel, String nombre, int categoria, double precio, boolean disponible) {
		super();
		this.nombre = nombre;
		this.categoria = categoria;
		this.precio = precio;
		this.disponible = disponible;
	}
	
	/**
	 * @return idHotel
	 */
	public int getIdHotel() {
		return idHotel;
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
	 * @return categoria
	 */
	public int getCategoria() {
		return categoria;
	}
	
	/**
	 * @param categoria
	 */
	public void setCategoria(int categoria) {
		this.categoria = categoria;
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
	 * @return disponible
	 */
	public boolean isDisponible() {
		return disponible;
	}
	
	/**
	 * @param disponible
	 */
	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}
}
