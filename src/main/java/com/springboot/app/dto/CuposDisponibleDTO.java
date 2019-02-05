package com.springboot.app.dto;

public class CuposDisponibleDTO {
	
	private String nombreServicio;
	private int cantidadCupo;
	private int grupo;
	
	public CuposDisponibleDTO(String nombreServicio, int cantidadCupo, int grupo) {
		this.nombreServicio = nombreServicio;
		this.cantidadCupo = cantidadCupo;
		this.grupo = grupo;
		
	}



	public String getNombreServicio() {
		return nombreServicio;
	}

	public void setNombreServicio(String nombreServicio) {
		this.nombreServicio = nombreServicio;
	}

	public int getCantidadCupo() {
		return cantidadCupo;
	}

	public void setCantidadCupo(int cantidadCupo) {
		this.cantidadCupo = cantidadCupo;
	}

	public int getGrupo() {
		return grupo;
	}

	public void setGrupo(int grupo) {
		this.grupo = grupo;
	}
	
	

}
