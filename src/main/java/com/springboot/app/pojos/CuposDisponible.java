package com.springboot.app.pojos;

public class CuposDisponible {
	
	private String nombreServicio;
	private Integer cantidadCupo;
	
	public CuposDisponible(String nombreServicio, Integer cantidadCupo) {
		this.nombreServicio = nombreServicio;
		this.cantidadCupo = cantidadCupo;
		
	}

	public String getNombreServicio() {
		return nombreServicio;
	}

	public void setNombreServicio(String nombreServicio) {
		this.nombreServicio = nombreServicio;
	}

	public Integer getCantidadCupo() {
		return cantidadCupo;
	}

	public void setCantidadCupo(Integer cantidadCupo) {
		this.cantidadCupo = cantidadCupo;
	}
	
	

}
