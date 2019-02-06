package com.springboot.app.models.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 * @author jjofre
 *
 */
@Entity
@Table(name="grupocupo")
public class GrupoCupo implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="GrC_ID")
	@NotNull
	private int grupoCupoID;  
	
	
	@Column(name="GrC_Gru_ID")
	private short grupoID;
	
	@Column(name="GrC_Desde")
	private Date desde;
	
	@Column(name="GrC_Hasta")
	private Date hasta;
	
	@Column(name = "GrC_Cantidad")
	private short cantidad;

	public int getGrupoCupoID() {
		return grupoCupoID;
	}

	public void setGrupoCupoID(int grupoCupoID) {
		this.grupoCupoID = grupoCupoID;
	}

	public short getGrupoID() {
		return grupoID;
	}

	public void setGrupoID(short grupoID) {
		this.grupoID = grupoID;
	}

	public Date getDesde() {
		return desde;
	}

	public void setDesde(Date desde) {
		this.desde = desde;
	}

	public Date getHasta() {
		return hasta;
	}

	public void setHasta(Date hasta) {
		this.hasta = hasta;
	}

	public short getCantidad() {
		return cantidad;
	}

	public void setCantidad(short cantidad) {
		this.cantidad = cantidad;
	}
	
	
	

}
