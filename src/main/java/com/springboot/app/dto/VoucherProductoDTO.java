package com.springboot.app.dto;

import java.util.Date;

public class VoucherProductoDTO {

	public int voucherproductoID;
    
	public int voucherID;
    
    public short productoID;
   
    public short cantidadpaxs;
      
    public Date created;

    public Date updated;

    public String uuid;
    
    

	public VoucherProductoDTO(int voucherproductoID, int voucherID, short productoID, short cantidadpaxs, Date created,
			Date updated, String uuid) {
		super();
		this.voucherproductoID = voucherproductoID;
		this.voucherID = voucherID;
		this.productoID = productoID;
		this.cantidadpaxs = cantidadpaxs;
		this.created = created;
		this.updated = updated;
		this.uuid = uuid;
	}


	
	public VoucherProductoDTO() {}

	public int getVoucherproductoID() {
		return voucherproductoID;
	}

	public void setVoucherproductoID(int voucherproductoID) {
		this.voucherproductoID = voucherproductoID;
	}

	public int getVoucherID() {
		return voucherID;
	}

	public void setVoucherID(int voucherID) {
		this.voucherID = voucherID;
	}

	public short getProductoID() {
		return productoID;
	}

	public void setProductoID(short productoID) {
		this.productoID = productoID;
	}

	public short getCantidadpaxs() {
		return cantidadpaxs;
	}

	public void setCantidadpaxs(short cantidadpaxs) {
		this.cantidadpaxs = cantidadpaxs;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public Date getUpdated() {
		return updated;
	}

	public void setUpdated(Date updated) {
		this.updated = updated;
	}

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}


}
