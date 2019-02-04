package com.springboot.app.dto;

import com.springboot.app.models.entity.Hotel;
import com.springboot.app.models.entity.Producto;

public class ReservaDTO {
	public int id;
	public String nombre;
	public String apellido;
	public int dni;
	public int edad;
	public Hotel hotel;
	public Boolean alojado;
	public String telefono;
	public Boolean whatapp;
	public Producto producto;
	public String accion;
	public String FechaServicio;
	public int cliente;
	public String nombreFantasia;
	public int confirmada;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public Hotel getHotel() {
		return hotel;
	}
	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}
	public Boolean getAlojado() {
		return alojado;
	}
	public void setAlojado(Boolean alojado) {
		this.alojado = alojado;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public Boolean getWhatapp() {
		return whatapp;
	}
	public void setWhatapp(Boolean whatapp) {
		this.whatapp = whatapp;
	}
	public Producto getProducto() {
		return producto;
	}
	public void setProducto(Producto producto) {
		this.producto = producto;
	}
	public String getAccion() {
		return accion;
	}
	public void setAccion(String accion) {
		this.accion = accion;
	}
	public String getFechaServicio() {
		return FechaServicio;
	}
	public void setFechaServicio(String fechaServicio) {
		FechaServicio = fechaServicio;
	}
	public int getCliente() {
		return cliente;
	}
	public void setCliente(int cliente) {
		this.cliente = cliente;
	}
	public String getNombreFantasia() {
		return nombreFantasia;
	}
	public void setNombreFantasia(String nombreFantasia) {
		this.nombreFantasia = nombreFantasia;
	}
	public int getConfirmada() {
		return confirmada;
	}
	public void setConfirmada(int confirmada) {
		this.confirmada = confirmada;
	}
	
	
	
}
