package com.springboot.app.models.entity;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="clientes")
public class Cliente implements Serializable {

	@Id
	@Column(name="codigo", unique=true)
	private int clienteID;
	
	@Column(name="Cli_Neg_ID")
	@NotNull
	private int negocioID;
	
	@NotNull
	private String cuit;
	
	@NotNull
	@Column(name="razon", length=60)
	private String razonsocial;
	
	@NotNull
	@Column(name="Cli_Fantasia", length=100)
	private String nombrefantasia;
	
	@Column(name="Cli_FechaRestaurant")
	private Date fecharestaurant;
	
	@NotNull
	@Column(name="cli_cantpaxs")
	private Integer cantidadpaxs;
	
	@NotNull
	@Column(name="Cli_Tipo")
	private int tipocliente;
	
	@NotNull
	@Column(name="domicilio", length=100)
	private String domicilio;
	
	@NotNull
	@Column(name="tel", length=20)
	private String telefono;
	
	@NotNull
	@Column(name="fax", length=20)
	private String fax;
	
	@NotNull
	@Column(name="email", length=40)
	private String email;
	
	@NotNull
	@Column(name="Celular", length=40)
	private String numeromovil;
	
	@NotNull
	@Column(name="Posicion")
	private int posicionIVA;
	
	@NotNull
	@Column(name="Constante")
	private int constante;
	
	@NotNull
	@Column(name="documento_id")
	private int documentoID;
	
	@NotNull
	@Column(name="TipoDoc", length=50)
	private String tipodocumento; 
	
	@NotNull
	@Column(name="nrodoc", length=50)
	private String numerodocumento; 
	
	@NotNull
	@Column(name="LimiteCredito")
	private Float limitecredito;
	
	@NotNull
	@Column(name="Nacionalidad", length=50)
	private String nacionalidad;
	
	@NotNull
	@Column(name="Cli_CCa_ID")
	private int clientecategoriaID;
	
	@NotNull
	@Column(name="Cli_IDImpositivo", length=50)
	private String impositivoID;
	
	//@Column(name="facturarextranjero")
	@NotNull
	private int facturarextranjero;
	
	@NotNull
	@Column(name="bloqueado")
	private int bloqueado; 
	
	@NotNull
	@Column(name="discapacitado")
	private int discapacitado;
	
	@Column(name="clave")
	private int autoID;
	
	@Column(name="created")
	private Timestamp created;
	
	@Column(name="updated")
	@NotNull
	private Timestamp updated;
	
	@NotNull
	@Column(name="uuid", length=32)
	private String uuid;
	
	@OneToOne(cascade=CascadeType.ALL)
	@PrimaryKeyJoinColumn
	private ClienteInternet clienteInternet;

	public int getClienteID() {
		return clienteID;
	}

	public void setClienteID(int clienteID) {
		this.clienteID = clienteID;
	}

	public int getNegocioID() {
		return negocioID;
	}

	public void setNegocioID(int negocioID) {
		this.negocioID = negocioID;
	}

	public String getCuit() {
		return cuit;
	}

	public void setCuit(String cuit) {
		this.cuit = cuit;
	}

	public String getRazonsocial() {
		return razonsocial;
	}

	public void setRazonsocial(String razonsocial) {
		this.razonsocial = razonsocial;
	}

	public String getNombrefantasia() {
		return nombrefantasia;
	}

	public void setNombrefantasia(String nombrefantasia) {
		this.nombrefantasia = nombrefantasia;
	}

	public Date getFecharestaurant() {
		return fecharestaurant;
	}

	public void setFecharestaurant(Date fecharestaurant) {
		this.fecharestaurant = fecharestaurant;
	}

	public Integer getCantidadpaxs() {
		return cantidadpaxs;
	}

	public void setCantidadpaxs(Integer cantidadpaxs) {
		this.cantidadpaxs = cantidadpaxs;
	}

	public int getTipocliente() {
		return tipocliente;
	}

	public void setTipocliente(int tipocliente) {
		this.tipocliente = tipocliente;
	}

	public String getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNumeromovil() {
		return numeromovil;
	}

	public void setNumeromovil(String numeromovil) {
		this.numeromovil = numeromovil;
	}

	public int getPosicionIVA() {
		return posicionIVA;
	}

	public void setPosicionIVA(int posicionIVA) {
		this.posicionIVA = posicionIVA;
	}

	public int getConstante() {
		return constante;
	}

	public void setConstante(int constante) {
		this.constante = constante;
	}

	public int getDocumentoID() {
		return documentoID;
	}

	public void setDocumentoID(int documentoID) {
		this.documentoID = documentoID;
	}

	public String getTipodocumento() {
		return tipodocumento;
	}

	public void setTipodocumento(String tipodocumento) {
		this.tipodocumento = tipodocumento;
	}

	public String getNumerodocumento() {
		return numerodocumento;
	}

	public void setNumerodocumento(String numerodocumento) {
		this.numerodocumento = numerodocumento;
	}

	public Float getLimitecredito() {
		return limitecredito;
	}

	public void setLimitecredito(Float limitecredito) {
		this.limitecredito = limitecredito;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public int getClientecategoriaID() {
		return clientecategoriaID;
	}

	public void setClientecategoriaID(int clientecategoriaID) {
		this.clientecategoriaID = clientecategoriaID;
	}

	public String getImpositivoID() {
		return impositivoID;
	}

	public void setImpositivoID(String impositivoID) {
		this.impositivoID = impositivoID;
	}

	public int getFacturarextranjero() {
		return facturarextranjero;
	}

	public void setFacturarextranjero(int facturarextranjero) {
		this.facturarextranjero = facturarextranjero;
	}

	public int getBloqueado() {
		return bloqueado;
	}

	public void setBloqueado(int bloqueado) {
		this.bloqueado = bloqueado;
	}

	public int getDiscapacitado() {
		return discapacitado;
	}

	public void setDiscapacitado(int discapacitado) {
		this.discapacitado = discapacitado;
	}

	public int getAutoID() {
		return autoID;
	}

	public void setAutoID(int autoID) {
		this.autoID = autoID;
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

	public ClienteInternet getClienteInternet() {
		return clienteInternet;
	}

	public void setClienteInternet(ClienteInternet clienteInternet) {
		this.clienteInternet = clienteInternet;
	}
}
