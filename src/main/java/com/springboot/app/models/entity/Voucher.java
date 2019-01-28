/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springboot.app.models.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Romina
 */
@Entity
@Table(name = "voucher")
public class Voucher implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Vou_ID")
    @NotNull
    private int voucherID;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "voucher")
    private List<VoucherPax> voucherpax;

    @Column(name = "Vou_FechaReserva")
    private Date fechatoma;

    @Column(name = "Vou_FechaIn")
    private Date fechaservicio;

    @Column(name = "Vou_Vto")
    private Date fechavencimiento;

    @Column(name = "Vou_HoraVto")
    private Date horavencimiento;

    @Column(name = "Vou_NombrePax")
    @NotNull
    @Size(max = 150)
    private String nombrepax;

    @NotNull
    @Column(name = "Vou_Paxs")
    @Digits(integer = 2, fraction = 0)
    private short cantidadpaxs;

    @NotNull
    @Column(name = "Vou_SubeEn")
    @Size(max = 150)
    private String subeen;

    @NotNull
    @Column(name = "Vou_Productos")
    @Size(max = 250)
    private String productos;

    @NotNull
    @Column(name = "Vou_Voucher")
    @Digits(integer = 1, fraction = 0)
    private short tienevoucher;

    @NotNull
    @Column(name = "Vou_Cli_ID")
    @Digits(integer = 4, fraction = 0)
    private int clienteID;

    @NotNull
    @Column(name = "Vou_Observ")
    @Size(max = 250)
    private String observaciones;

    @NotNull
    @Digits(integer = 1, fraction = 0)
    @Column(name = "Vou_Confirmado")
    private short confirmado;

    @NotNull
    @Column(name = "paga_cacheuta")
    @Digits(integer = 1, fraction = 0)
    private short pagacacheuta;

    @NotNull
    @Column(name = "Vou_Hot_ID")
    @Digits(integer = 4, fraction = 0)
    private int hotelID;

    @NotNull
    @Column(name = "Vou_Cliente")
    @Size(max = 50)
    private String contacto;

    @NotNull
    @Column(name = "Vou_PaxsReales")
    @Digits(integer = 2, fraction = 0)
    private int paxsreales;

    @NotNull
    @Column(name = "Vou_Pro_ID")
    @Digits(integer = 2, fraction = 0)
    private int proveedorID;

    @NotNull
    @Column(name = "Vou_Planilla")
    @Size(max = 30)
    private String planilla;

    @NotNull
    @Column(name = "Vou_Res_ID")
    private int reservaID;

    @NotNull
    @Column(name = "Vou_NroVoucher")
    @Size(max = 50)
    private String numerovoucher;

    @NotNull
    @Column(name = "Vou_Usuario")
    @Size(max = 20)
    private String usuario;

    @Column(name = "Vou_FechaRecepcion")
    private Date conffecharecepcion;

    @Column(name = "Vou_FechaEmision")
    private Date conffechaemision;

    @Column(name = "Vou_Numero")
    @Size(max = 50)
    private String confnumero;

    @Column(name = "Vou_CantidadPax")
    @Digits(integer = 2, fraction = 0)
    private int confcantidadpaxs;

    @Column(name = "Vou_Nombre")
    @Size(max = 250)
    private String confnombre;

    @Column(name = "Vou_ConTraslado")
    @Digits(integer = 1, fraction = 0)
    private short confcontraslado;

    @Column(name = "Vou_PaxsNoShow")
    @Digits(integer = 2, fraction = 0)
    private int confpaxsnoshow;

    @NotNull
    @Column(name = "Vou_ReO_ID")
    @Digits(integer = 2, fraction = 0)
    private int reservaorigenID;

    @NotNull
    @Column(name = "fecha_abierta")
    @Digits(integer = 1, fraction = 0)
    private short fechaabierta;

    private Date created;

    @NotNull
    private Date updated;

    @NotNull
    @Size(max = 32)
    private String uuid;

    public Voucher() {
        super();
    }

    public int getVoucherID() {
        return voucherID;
    }

    public void setVoucherID(int voucherID) {
        this.voucherID = voucherID;
    }

    public Date getFechatoma() {
        return fechatoma;
    }

    public void setFechatoma(Date fechatoma) {
        this.fechatoma = fechatoma;
    }

    public Date getFechaservicio() {
        return fechaservicio;
    }

    public void setFechaservicio(Date fechaservicio) {
        this.fechaservicio = fechaservicio;
    }

    public Date getFechavencimiento() {
        return fechavencimiento;
    }

    public void setFechavencimiento(Date fechavencimiento) {
        this.fechavencimiento = fechavencimiento;
    }

    public Date getHoravencimiento() {
        return horavencimiento;
    }

    public void setHoravencimiento(Date horavencimiento) {
        this.horavencimiento = horavencimiento;
    }

    public String getNombrepax() {
        return nombrepax;
    }

    public void setNombrepax(String nombrepax) {
        this.nombrepax = nombrepax;
    }

    public short getCantidadpaxs() {
        return cantidadpaxs;
    }

    public void setCantidadpaxs(short cantidadpaxs) {
        this.cantidadpaxs = cantidadpaxs;
    }

    public String getSubeen() {
        return subeen;
    }

    public void setSubeen(String subeen) {
        this.subeen = subeen;
    }

    public String getProductos() {
        return productos;
    }

    public void setProductos(String productos) {
        this.productos = productos;
    }

    public short getTienevoucher() {
        return tienevoucher;
    }

    public void setTienevoucher(short tienevoucher) {
        this.tienevoucher = tienevoucher;
    }

    public int getClienteID() {
        return clienteID;
    }

    public void setClienteID(int clienteID) {
        this.clienteID = clienteID;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public short getConfirmado() {
        return confirmado;
    }

    public void setConfirmado(short confirmado) {
        this.confirmado = confirmado;
    }

    public short getPagacacheuta() {
        return pagacacheuta;
    }

    public void setPagacacheuta(short pagacacheuta) {
        this.pagacacheuta = pagacacheuta;
    }

    public int getHotelID() {
        return hotelID;
    }

    public void setHotelID(int hotelID) {
        this.hotelID = hotelID;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public int getPaxsreales() {
        return paxsreales;
    }

    public void setPaxsreales(int paxsreales) {
        this.paxsreales = paxsreales;
    }

    public int getProveedorID() {
        return proveedorID;
    }

    public void setProveedorID(int proveedorID) {
        this.proveedorID = proveedorID;
    }

    public String getPlanilla() {
        return planilla;
    }

    public void setPlanilla(String planilla) {
        this.planilla = planilla;
    }

    public int getReservaID() {
        return reservaID;
    }

    public void setReservaID(int reservaID) {
        this.reservaID = reservaID;
    }

    public String getNumerovoucher() {
        return numerovoucher;
    }

    public void setNumerovoucher(String numerovoucher) {
        this.numerovoucher = numerovoucher;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public Date getConffecharecepcion() {
        return conffecharecepcion;
    }

    public void setConffecharecepcion(Date conffecharecepcion) {
        this.conffecharecepcion = conffecharecepcion;
    }

    public Date getConffechaemision() {
        return conffechaemision;
    }

    public void setConffechaemision(Date conffechaemision) {
        this.conffechaemision = conffechaemision;
    }

    public String getConfnumero() {
        return confnumero;
    }

    public void setConfnumero(String confnumero) {
        this.confnumero = confnumero;
    }

    public int getConfcantidadpaxs() {
        return confcantidadpaxs;
    }

    public void setConfcantidadpaxs(int confcantidadpaxs) {
        this.confcantidadpaxs = confcantidadpaxs;
    }

    public String getConfnombre() {
        return confnombre;
    }

    public void setConfnombre(String confnombre) {
        this.confnombre = confnombre;
    }

    public short getConfcontraslado() {
        return confcontraslado;
    }

    public void setConfcontraslado(short confcontraslado) {
        this.confcontraslado = confcontraslado;
    }

    public int getConfpaxsnoshow() {
        return confpaxsnoshow;
    }

    public void setConfpaxsnoshow(int confpaxsnoshow) {
        this.confpaxsnoshow = confpaxsnoshow;
    }

    public int getReservaorigenID() {
        return reservaorigenID;
    }

    public void setReservaorigenID(int reservaorigenID) {
        this.reservaorigenID = reservaorigenID;
    }

    public short getFechaabierta() {
        return fechaabierta;
    }

    public void setFechaabierta(short fechaabierta) {
        this.fechaabierta = fechaabierta;
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
        int hash = 3;
        hash = 59 * hash + this.voucherID;
        hash = 59 * hash + Objects.hashCode(this.fechatoma);
        hash = 59 * hash + Objects.hashCode(this.fechaservicio);
        hash = 59 * hash + Objects.hashCode(this.fechavencimiento);
        hash = 59 * hash + Objects.hashCode(this.horavencimiento);
        hash = 59 * hash + Objects.hashCode(this.nombrepax);
        hash = 59 * hash + this.cantidadpaxs;
        hash = 59 * hash + Objects.hashCode(this.subeen);
        hash = 59 * hash + Objects.hashCode(this.productos);
        hash = 59 * hash + this.tienevoucher;
        hash = 59 * hash + this.clienteID;
        hash = 59 * hash + Objects.hashCode(this.observaciones);
        hash = 59 * hash + this.confirmado;
        hash = 59 * hash + this.pagacacheuta;
        hash = 59 * hash + this.hotelID;
        hash = 59 * hash + Objects.hashCode(this.contacto);
        hash = 59 * hash + this.paxsreales;
        hash = 59 * hash + this.proveedorID;
        hash = 59 * hash + Objects.hashCode(this.planilla);
        hash = 59 * hash + this.reservaID;
        hash = 59 * hash + Objects.hashCode(this.numerovoucher);
        hash = 59 * hash + Objects.hashCode(this.usuario);
        hash = 59 * hash + Objects.hashCode(this.conffecharecepcion);
        hash = 59 * hash + Objects.hashCode(this.conffechaemision);
        hash = 59 * hash + Objects.hashCode(this.confnumero);
        hash = 59 * hash + this.confcantidadpaxs;
        hash = 59 * hash + Objects.hashCode(this.confnombre);
        hash = 59 * hash + this.confcontraslado;
        hash = 59 * hash + this.confpaxsnoshow;
        hash = 59 * hash + this.reservaorigenID;
        hash = 59 * hash + this.fechaabierta;
        hash = 59 * hash + Objects.hashCode(this.created);
        hash = 59 * hash + Objects.hashCode(this.updated);
        hash = 59 * hash + Objects.hashCode(this.uuid);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Voucher other = (Voucher) obj;
        if (this.voucherID != other.voucherID) {
            return false;
        }
        if (this.cantidadpaxs != other.cantidadpaxs) {
            return false;
        }
        if (this.tienevoucher != other.tienevoucher) {
            return false;
        }
        if (this.clienteID != other.clienteID) {
            return false;
        }
        if (this.confirmado != other.confirmado) {
            return false;
        }
        if (this.pagacacheuta != other.pagacacheuta) {
            return false;
        }
        if (this.hotelID != other.hotelID) {
            return false;
        }
        if (this.paxsreales != other.paxsreales) {
            return false;
        }
        if (this.proveedorID != other.proveedorID) {
            return false;
        }
        if (this.reservaID != other.reservaID) {
            return false;
        }
        if (this.numerovoucher != other.numerovoucher) {
            return false;
        }
        if (this.confcantidadpaxs != other.confcantidadpaxs) {
            return false;
        }
        if (this.confcontraslado != other.confcontraslado) {
            return false;
        }
        if (this.confpaxsnoshow != other.confpaxsnoshow) {
            return false;
        }
        if (this.reservaorigenID != other.reservaorigenID) {
            return false;
        }
        if (this.fechaabierta != other.fechaabierta) {
            return false;
        }
        if (!Objects.equals(this.nombrepax, other.nombrepax)) {
            return false;
        }
        if (!Objects.equals(this.subeen, other.subeen)) {
            return false;
        }
        if (!Objects.equals(this.productos, other.productos)) {
            return false;
        }
        if (!Objects.equals(this.observaciones, other.observaciones)) {
            return false;
        }
        if (!Objects.equals(this.contacto, other.contacto)) {
            return false;
        }
        if (!Objects.equals(this.planilla, other.planilla)) {
            return false;
        }
        if (!Objects.equals(this.usuario, other.usuario)) {
            return false;
        }
        if (!Objects.equals(this.confnumero, other.confnumero)) {
            return false;
        }
        if (!Objects.equals(this.confnombre, other.confnombre)) {
            return false;
        }
        if (!Objects.equals(this.uuid, other.uuid)) {
            return false;
        }
        if (!Objects.equals(this.fechatoma, other.fechatoma)) {
            return false;
        }
        if (!Objects.equals(this.fechaservicio, other.fechaservicio)) {
            return false;
        }
        if (!Objects.equals(this.fechavencimiento, other.fechavencimiento)) {
            return false;
        }
        if (!Objects.equals(this.horavencimiento, other.horavencimiento)) {
            return false;
        }
        if (!Objects.equals(this.conffecharecepcion, other.conffecharecepcion)) {
            return false;
        }
        if (!Objects.equals(this.conffechaemision, other.conffechaemision)) {
            return false;
        }
        if (!Objects.equals(this.created, other.created)) {
            return false;
        }
        if (!Objects.equals(this.updated, other.updated)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Voucher{" + "voucherID=" + voucherID + ", fechatoma=" + fechatoma + ", fechaservicio=" + fechaservicio + ", fechavencimiento=" + fechavencimiento + ", horavencimiento=" + horavencimiento + ", nombrepax=" + nombrepax + ", cantidadpaxs=" + cantidadpaxs + ", subeen=" + subeen + ", productos=" + productos + ", tienevoucher=" + tienevoucher + ", clienteID=" + clienteID + ", observaciones=" + observaciones + ", confirmado=" + confirmado + ", pagacacheuta=" + pagacacheuta + ", hotelID=" + hotelID + ", contacto=" + contacto + ", paxsreales=" + paxsreales + ", proveedorID=" + proveedorID + ", planilla=" + planilla + ", reservaID=" + reservaID + ", numerovoucher=" + numerovoucher + ", usuario=" + usuario + ", conffecharecepcion=" + conffecharecepcion + ", conffechaemision=" + conffechaemision + ", confnumero=" + confnumero + ", confcantidadpaxs=" + confcantidadpaxs + ", confnombre=" + confnombre + ", confcontraslado=" + confcontraslado + ", confpaxsnoshow=" + confpaxsnoshow + ", reservaorigenID=" + reservaorigenID + ", fechaabierta=" + fechaabierta + ", created=" + created + ", updated=" + updated + ", uuid=" + uuid + '}';
    }

}
