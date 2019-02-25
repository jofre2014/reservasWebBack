package com.springboot.app.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.springboot.app.models.entity.VoucherPax;

public class ReservaPaxsDTO implements Serializable {
	
	public int reservaId;
	public String FechaServicio;
	public List<VoucherPax> paxs;
	
	public int getReservaId() {
		return reservaId;
	}
	public void setReservaId(int reservaId) {
		this.reservaId = reservaId;
	}
	public String getFechaServicio() {
		return FechaServicio;
	}
	public void setFechaServicio(String fechaServicio) {
		FechaServicio = fechaServicio;
	}
	public List<VoucherPax> getPaxs() {
		return paxs;
	}
	public void setPaxs(List<VoucherPax> paxs) {
		this.paxs = paxs;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((FechaServicio == null) ? 0 : FechaServicio.hashCode());
		result = prime * result + ((paxs == null) ? 0 : paxs.hashCode());
		result = prime * result + reservaId;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ReservaPaxsDTO other = (ReservaPaxsDTO) obj;
		if (FechaServicio == null) {
			if (other.FechaServicio != null)
				return false;
		} else if (!FechaServicio.equals(other.FechaServicio))
			return false;
		if (paxs == null) {
			if (other.paxs != null)
				return false;
		} else if (!paxs.equals(other.paxs))
			return false;
		if (reservaId != other.reservaId)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "ReservaPaxsDTO [reservaId=" + reservaId + ", FechaServicio=" + FechaServicio + ", paxs=" + paxs + "]";
	}
	
	

}
