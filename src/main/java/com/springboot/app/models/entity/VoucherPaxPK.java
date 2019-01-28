package com.springboot.app.models.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;

@Embeddable
public class VoucherPaxPK implements Serializable{
	
	@Column(name = "voucher_id")
	@NotNull
	@Digits(integer = 4, fraction = 0)
	private int voucherID;
	
	@Column(name = "hotel_id")
	@NotNull
	@Digits(integer = 4, fraction = 0)
	private int hotelID;
	
	@Column(name = "producto_id")
	@NotNull
	@Digits(integer = 4, fraction = 0)
	private int productoID;
	


	public VoucherPaxPK(int voucherID, int hotelID, int productoID, int voucherpaxID) {		
		this.voucherID = voucherID;
		this.hotelID = hotelID;
		this.productoID = productoID;
		
	}

	public int getVoucherID() {
		return voucherID;
	}

	public void setVoucherID(int voucherID) {
		this.voucherID = voucherID;
	}

	public int getHotelID() {
		return hotelID;
	}

	public void setHotelID(int hotelID) {
		this.hotelID = hotelID;
	}

	public int getProductoID() {
		return productoID;
	}

	public void setProductoID(int productoID) {
		this.productoID = productoID;
	}


	
	

}
