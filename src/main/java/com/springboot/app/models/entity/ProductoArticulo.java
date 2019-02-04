package com.springboot.app.models.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name="productoarticulo")
public class ProductoArticulo implements Serializable {
	
	@Id
	@NotNull
	@Column(name="PAr_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	private int productoarticuloId;
	
	@NotNull
	@Column(name="PAr_Neg_ID")
	private short negocioID;
	
//	@NotNull
//	@Column(name="PAr_Prd_ID")
//	private short productoID;
	
//	@NotNull
//	@Column(name="PAr_Art_ID")
//	private String articuloID;
	
	private Date created;

    @NotNull
    private Date updated;

    @NotNull
    @Size(max = 32)
    private String uuid;
    
    @ManyToOne
    @JoinColumn(name="PAr_Art_ID", nullable = false, updatable = false)
    private Articulo articulo;
    
    @ManyToOne
    @JoinColumn(name = "PAr_Prd_ID", nullable = false, updatable = false)
    private Producto producto;

	public int getProductoarticuloId() {
		return productoarticuloId;
	}

	public void setProductoarticuloId(int productoarticuloId) {
		this.productoarticuloId = productoarticuloId;
	}

	public short getNegocioID() {
		return negocioID;
	}

	public void setNegocioID(short negocioID) {
		this.negocioID = negocioID;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;		
		result = prime * result + ((created == null) ? 0 : created.hashCode());
		result = prime * result + negocioID;
		result = prime * result + productoarticuloId;
		result = prime * result + ((updated == null) ? 0 : updated.hashCode());
		result = prime * result + ((uuid == null) ? 0 : uuid.hashCode());
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
		ProductoArticulo other = (ProductoArticulo) obj;		
		if (created == null) {
			if (other.created != null)
				return false;
		} else if (!created.equals(other.created))
			return false;
		if (negocioID != other.negocioID)
			return false;
		if (productoarticuloId != other.productoarticuloId)
			return false;
		if (updated == null) {
			if (other.updated != null)
				return false;
		} else if (!updated.equals(other.updated))
			return false;
		if (uuid == null) {
			if (other.uuid != null)
				return false;
		} else if (!uuid.equals(other.uuid))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ProductoArticulo [productoarticuloId=" + productoarticuloId + ", negocioID=" + negocioID
				+ ", created=" + created + ", updated="
				+ updated + ", uuid=" + uuid + "]";
	}
	
	
	

	

}
