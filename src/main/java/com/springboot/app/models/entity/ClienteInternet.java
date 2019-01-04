package com.springboot.app.models.entity;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="clienteinternet")
public class ClienteInternet implements Serializable {
	
	@Id
	@Column(name="cliente_id")
	private int clienteID;
	
	@Column(name="password")
	private String password;
	
	@Column(name="created")
	private Timestamp created;
	
	@Column(name="updated")
	private Timestamp updated;
	
	@Column(name="uuid", length=32)
	private String uuid;

	public int getClienteID() {
		return clienteID;
	}

	public void setClienteID(int clienteID) {
		this.clienteID = clienteID;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Timestamp getCreated() {
		return created;
	}

	public void setCreated(Timestamp created) {
		this.created = created;
	}

	public Timestamp getUpdated() {
		return updated;
	}

	public void setUpdated(Timestamp updated) {
		this.updated = updated;
	}

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}


}
