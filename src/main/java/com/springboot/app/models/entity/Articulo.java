/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springboot.app.models.entity;

import java.util.Date;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


/**
 *
 * @author Romina
 */
public class Articulo {
    
    @Column(name="Codigo")
    @NotNull
    @Size(max = 20)
    private String articuloID;
    
    @Column(name="Art_Neg_ID")
    @NotNull
    @Digits(integer = 2, fraction = 0)
    private short negocioID;
    
    @Column(name="Descripcion")
    @NotNull
    @Size(max = 50)
    private String descripcion;
    
    @Column(name="Art_Voucher")
    @NotNull
    @Size(max = 150)
    private String leyendavoucher;
    
    @Column(name="precioVentaSinIva")
    @NotNull
    @Digits(integer = 16, fraction = 2)
    private double  precioventasiniva;
    
    @Column(name="PrecioUnitario")
    @NotNull
    @Digits(integer = 16, fraction = 2)
    private double precioventaconiva;
    
    @Column(name="CgoContable")
    @NotNull
    @Digits(integer = 4, fraction = 0)
    private int cuentaventas;
    
    @Column(name="CgoContableCompras")
    @NotNull
    @Digits(integer = 4, fraction = 0)
    private int cuentacompras;
    
    @Column(name="CgoContableGastos")
    @NotNull
    @Digits(integer = 4, fraction = 0)
    private int cuentagastos;
    
    @Column(name="CgoCentro")
    @NotNull
    @Digits(integer = 4, fraction = 0)
    private int centrostockID;
    
    @Column(name="CgoRubro")
    @NotNull
    @Digits(integer = 4, fraction = 0)
    private int rubroID;
    
    @Column(name="CgoSubRubro")
    @NotNull
    @Digits(integer = 4, fraction = 0)
    private int subrubroID;
    
    @Column(name="PrecioCompra")
    @NotNull
    @Digits(integer = 16, fraction = 2)
    private double preciocompra;
    
    @Column(name="Iva105")
    @NotNull
    @Digits(integer = 1, fraction = 0)
    private short iva105;
    
    @Column(name="Art_CompraNeto")
    @NotNull
    @Digits(integer = 16, fraction = 2)
    private double preciocompraneto;
    
    @Column(name="Exento")
    @NotNull
    @Digits(integer = 1, fraction = 0)
    private short exento;
    
    @Column(name="StockMinimo")
    @NotNull
    @Digits(integer = 4, fraction = 0)
    private int stockminimo;
    
    @Column(name="StockOptimo")
    @NotNull
    @Digits(integer = 4, fraction = 0)
    private int stockoptimo;
    
    @Column(name="BloqueoCompras")
    @NotNull
    @Digits(integer = 1, fraction = 0)
    private short bloqueocompras;
    
    @Column(name="BloqueoStock")
    @NotNull
    @Digits(integer = 1, fraction = 0)
    private short bloqueostock;
    
    @Column(name="BloqueoVentas")
    @NotNull
    @Digits(integer = 1, fraction = 0)
    private short bloqueoventas;
    
    @Column(name="Art_UMe_ID")
    @NotNull
    @Digits(integer = 4, fraction = 0)
    private int unidadmedidaID;
    
    @Column(name="Art_ConDecimales")
    @NotNull
    @Digits(integer = 1, fraction = 0)
    private short condecimales;
   
    @Column(name="Art_Ventas")
    @NotNull
    @Digits(integer = 4, fraction = 0)
    private int ventas;
    
    @Column(name="Art_Compras")
    @NotNull
    @Digits(integer = 1, fraction = 0)
    private short compras;
    
    @Column(name="UMedida")
    @NotNull
    @Size(max = 20)
    private String unidadmedida;
    
    @Column(name="Art_Con_ID")
    @NotNull
    @Digits(integer = 2, fraction = 0)
    private short conversionID;
    
    @Column(name="Art_VentaSinStock")
    @NotNull
    @Digits(integer = 1, fraction = 0)
    private short ventasinstock;
    
    @Column(name="Art_ControlStock")
    @NotNull
    @Digits(integer = 1, fraction = 0)
    private short controlastock;
    
    @Column(name="Art_AsientoCostos")
    @NotNull
    @Digits(integer = 1, fraction = 0)
    private short asientocostos;
    
    @Column(name="Art_MaskBal")
    @NotNull
    @Size(max = 5)
    private String mascarabalanza;
    
    @Column(name="Art_HabIngreso")
    @NotNull
    @Digits(integer = 1, fraction = 0)
    private short habilitaingreso;
    
    @Column(name="Art_Comision")
    @NotNull
    @Digits(integer = 10, fraction = 2)
    private double comision;
    
    @Column(name="Art_Pre_ID")
    @NotNull
    @Digits(integer = 2, fraction = 0)
    private short prestadorID;
    
    @NotNull
    @Digits(integer = 4, fraction = 0)
    @Column(name = "Clave")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int autoID;
    
    private Date created;

    @NotNull
    private Date updated;

    @NotNull
    @Size(max = 32)
    private String uuid;

    public Articulo() {
        super();
    }

    public String getArticuloID() {
        return articuloID;
    }

    public void setArticuloID(String articuloID) {
        this.articuloID = articuloID;
    }

    public short getNegocioID() {
        return negocioID;
    }

    public void setNegocioID(short negocioID) {
        this.negocioID = negocioID;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getLeyendavoucher() {
        return leyendavoucher;
    }

    public void setLeyendavoucher(String leyendavoucher) {
        this.leyendavoucher = leyendavoucher;
    }

    public double getPrecioventasiniva() {
        return precioventasiniva;
    }

    public void setPrecioventasiniva(double precioventasiniva) {
        this.precioventasiniva = precioventasiniva;
    }

    public double getPrecioventaconiva() {
        return precioventaconiva;
    }

    public void setPrecioventaconiva(double precioventaconiva) {
        this.precioventaconiva = precioventaconiva;
    }

    public int getCuentaventas() {
        return cuentaventas;
    }

    public void setCuentaventas(int cuentaventas) {
        this.cuentaventas = cuentaventas;
    }

    public int getCuentacompras() {
        return cuentacompras;
    }

    public void setCuentacompras(int cuentacompras) {
        this.cuentacompras = cuentacompras;
    }

    public int getCuentagastos() {
        return cuentagastos;
    }

    public void setCuentagastos(int cuentagastos) {
        this.cuentagastos = cuentagastos;
    }

    public int getCentrostockID() {
        return centrostockID;
    }

    public void setCentrostockID(int centrostockID) {
        this.centrostockID = centrostockID;
    }

    public int getRubroID() {
        return rubroID;
    }

    public void setRubroID(int rubroID) {
        this.rubroID = rubroID;
    }

    public int getSubrubroID() {
        return subrubroID;
    }

    public void setSubrubroID(int subrubroID) {
        this.subrubroID = subrubroID;
    }

    public double getPreciocompra() {
        return preciocompra;
    }

    public void setPreciocompra(double preciocompra) {
        this.preciocompra = preciocompra;
    }

    public short getIva105() {
        return iva105;
    }

    public void setIva105(short iva105) {
        this.iva105 = iva105;
    }

    public double getPreciocompraneto() {
        return preciocompraneto;
    }

    public void setPreciocompraneto(double preciocompraneto) {
        this.preciocompraneto = preciocompraneto;
    }

    public short getExento() {
        return exento;
    }

    public void setExento(short exento) {
        this.exento = exento;
    }

    public int getStockminimo() {
        return stockminimo;
    }

    public void setStockminimo(int stockminimo) {
        this.stockminimo = stockminimo;
    }

    public int getStockoptimo() {
        return stockoptimo;
    }

    public void setStockoptimo(int stockoptimo) {
        this.stockoptimo = stockoptimo;
    }

    public short getBloqueocompras() {
        return bloqueocompras;
    }

    public void setBloqueocompras(short bloqueocompras) {
        this.bloqueocompras = bloqueocompras;
    }

    public short getBloqueostock() {
        return bloqueostock;
    }

    public void setBloqueostock(short bloqueostock) {
        this.bloqueostock = bloqueostock;
    }

    public short getBloqueoventas() {
        return bloqueoventas;
    }

    public void setBloqueoventas(short bloqueoventas) {
        this.bloqueoventas = bloqueoventas;
    }

    public int getUnidadmedidaID() {
        return unidadmedidaID;
    }

    public void setUnidadmedidaID(int unidadmedidaID) {
        this.unidadmedidaID = unidadmedidaID;
    }

    public short getCondecimales() {
        return condecimales;
    }

    public void setCondecimales(short condecimales) {
        this.condecimales = condecimales;
    }

    public int getVentas() {
        return ventas;
    }

    public void setVentas(int ventas) {
        this.ventas = ventas;
    }

    public short getCompras() {
        return compras;
    }

    public void setCompras(short compras) {
        this.compras = compras;
    }

    public String getUnidadmedida() {
        return unidadmedida;
    }

    public void setUnidadmedida(String unidadmedida) {
        this.unidadmedida = unidadmedida;
    }

    public short getConversionID() {
        return conversionID;
    }

    public void setConversionID(short conversionID) {
        this.conversionID = conversionID;
    }

    public short getVentasinstock() {
        return ventasinstock;
    }

    public void setVentasinstock(short ventasinstock) {
        this.ventasinstock = ventasinstock;
    }

    public short getControlastock() {
        return controlastock;
    }

    public void setControlastock(short controlastock) {
        this.controlastock = controlastock;
    }

    public short getAsientocostos() {
        return asientocostos;
    }

    public void setAsientocostos(short asientocostos) {
        this.asientocostos = asientocostos;
    }

    public String getMascarabalanza() {
        return mascarabalanza;
    }

    public void setMascarabalanza(String mascarabalanza) {
        this.mascarabalanza = mascarabalanza;
    }

    public short getHabilitaingreso() {
        return habilitaingreso;
    }

    public void setHabilitaingreso(short habilitaingreso) {
        this.habilitaingreso = habilitaingreso;
    }

    public double getComision() {
        return comision;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }

    public short getPrestadorID() {
        return prestadorID;
    }

    public void setPrestadorID(short prestadorID) {
        this.prestadorID = prestadorID;
    }

    public int getAutoID() {
        return autoID;
    }

    public void setAutoID(int autoID) {
        this.autoID = autoID;
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
        hash = 11 * hash + Objects.hashCode(this.articuloID);
        hash = 11 * hash + this.negocioID;
        hash = 11 * hash + Objects.hashCode(this.descripcion);
        hash = 11 * hash + Objects.hashCode(this.leyendavoucher);
        hash = 11 * hash + (int) (Double.doubleToLongBits(this.precioventasiniva) ^ (Double.doubleToLongBits(this.precioventasiniva) >>> 32));
        hash = 11 * hash + (int) (Double.doubleToLongBits(this.precioventaconiva) ^ (Double.doubleToLongBits(this.precioventaconiva) >>> 32));
        hash = 11 * hash + this.cuentaventas;
        hash = 11 * hash + this.cuentacompras;
        hash = 11 * hash + this.cuentagastos;
        hash = 11 * hash + this.centrostockID;
        hash = 11 * hash + this.rubroID;
        hash = 11 * hash + this.subrubroID;
        hash = 11 * hash + (int) (Double.doubleToLongBits(this.preciocompra) ^ (Double.doubleToLongBits(this.preciocompra) >>> 32));
        hash = 11 * hash + this.iva105;
        hash = 11 * hash + (int) (Double.doubleToLongBits(this.preciocompraneto) ^ (Double.doubleToLongBits(this.preciocompraneto) >>> 32));
        hash = 11 * hash + this.exento;
        hash = 11 * hash + this.stockminimo;
        hash = 11 * hash + this.stockoptimo;
        hash = 11 * hash + this.bloqueocompras;
        hash = 11 * hash + this.bloqueostock;
        hash = 11 * hash + this.bloqueoventas;
        hash = 11 * hash + this.unidadmedidaID;
        hash = 11 * hash + this.condecimales;
        hash = 11 * hash + this.ventas;
        hash = 11 * hash + this.compras;
        hash = 11 * hash + Objects.hashCode(this.unidadmedida);
        hash = 11 * hash + this.conversionID;
        hash = 11 * hash + this.ventasinstock;
        hash = 11 * hash + this.controlastock;
        hash = 11 * hash + this.asientocostos;
        hash = 11 * hash + Objects.hashCode(this.mascarabalanza);
        hash = 11 * hash + this.habilitaingreso;
        hash = 11 * hash + (int) (Double.doubleToLongBits(this.comision) ^ (Double.doubleToLongBits(this.comision) >>> 32));
        hash = 11 * hash + this.prestadorID;
        hash = 11 * hash + this.autoID;
        hash = 11 * hash + Objects.hashCode(this.created);
        hash = 11 * hash + Objects.hashCode(this.updated);
        hash = 11 * hash + Objects.hashCode(this.uuid);
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
        final Articulo other = (Articulo) obj;
        if (this.negocioID != other.negocioID) {
            return false;
        }
        if (Double.doubleToLongBits(this.precioventasiniva) != Double.doubleToLongBits(other.precioventasiniva)) {
            return false;
        }
        if (Double.doubleToLongBits(this.precioventaconiva) != Double.doubleToLongBits(other.precioventaconiva)) {
            return false;
        }
        if (this.cuentaventas != other.cuentaventas) {
            return false;
        }
        if (this.cuentacompras != other.cuentacompras) {
            return false;
        }
        if (this.cuentagastos != other.cuentagastos) {
            return false;
        }
        if (this.centrostockID != other.centrostockID) {
            return false;
        }
        if (this.rubroID != other.rubroID) {
            return false;
        }
        if (this.subrubroID != other.subrubroID) {
            return false;
        }
        if (Double.doubleToLongBits(this.preciocompra) != Double.doubleToLongBits(other.preciocompra)) {
            return false;
        }
        if (this.iva105 != other.iva105) {
            return false;
        }
        if (Double.doubleToLongBits(this.preciocompraneto) != Double.doubleToLongBits(other.preciocompraneto)) {
            return false;
        }
        if (this.exento != other.exento) {
            return false;
        }
        if (this.stockminimo != other.stockminimo) {
            return false;
        }
        if (this.stockoptimo != other.stockoptimo) {
            return false;
        }
        if (this.bloqueocompras != other.bloqueocompras) {
            return false;
        }
        if (this.bloqueostock != other.bloqueostock) {
            return false;
        }
        if (this.bloqueoventas != other.bloqueoventas) {
            return false;
        }
        if (this.unidadmedidaID != other.unidadmedidaID) {
            return false;
        }
        if (this.condecimales != other.condecimales) {
            return false;
        }
        if (this.ventas != other.ventas) {
            return false;
        }
        if (this.compras != other.compras) {
            return false;
        }
        if (this.conversionID != other.conversionID) {
            return false;
        }
        if (this.ventasinstock != other.ventasinstock) {
            return false;
        }
        if (this.controlastock != other.controlastock) {
            return false;
        }
        if (this.asientocostos != other.asientocostos) {
            return false;
        }
        if (this.habilitaingreso != other.habilitaingreso) {
            return false;
        }
        if (Double.doubleToLongBits(this.comision) != Double.doubleToLongBits(other.comision)) {
            return false;
        }
        if (this.prestadorID != other.prestadorID) {
            return false;
        }
        if (this.autoID != other.autoID) {
            return false;
        }
        if (!Objects.equals(this.articuloID, other.articuloID)) {
            return false;
        }
        if (!Objects.equals(this.descripcion, other.descripcion)) {
            return false;
        }
        if (!Objects.equals(this.leyendavoucher, other.leyendavoucher)) {
            return false;
        }
        if (!Objects.equals(this.unidadmedida, other.unidadmedida)) {
            return false;
        }
        if (!Objects.equals(this.mascarabalanza, other.mascarabalanza)) {
            return false;
        }
        if (!Objects.equals(this.uuid, other.uuid)) {
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
        return "Articulo{" + "articuloID=" + articuloID + ", negocioID=" + negocioID + ", descripcion=" + descripcion + ", leyendavoucher=" + leyendavoucher + ", precioventasiniva=" + precioventasiniva + ", precioventaconiva=" + precioventaconiva + ", cuentaventas=" + cuentaventas + ", cuentacompras=" + cuentacompras + ", cuentagastos=" + cuentagastos + ", centrostockID=" + centrostockID + ", rubroID=" + rubroID + ", subrubroID=" + subrubroID + ", preciocompra=" + preciocompra + ", iva105=" + iva105 + ", preciocompraneto=" + preciocompraneto + ", exento=" + exento + ", stockminimo=" + stockminimo + ", stockoptimo=" + stockoptimo + ", bloqueocompras=" + bloqueocompras + ", bloqueostock=" + bloqueostock + ", bloqueoventas=" + bloqueoventas + ", unidadmedidaID=" + unidadmedidaID + ", condecimales=" + condecimales + ", ventas=" + ventas + ", compras=" + compras + ", unidadmedida=" + unidadmedida + ", conversionID=" + conversionID + ", ventasinstock=" + ventasinstock + ", controlastock=" + controlastock + ", asientocostos=" + asientocostos + ", mascarabalanza=" + mascarabalanza + ", habilitaingreso=" + habilitaingreso + ", comision=" + comision + ", prestadorID=" + prestadorID + ", autoID=" + autoID + ", created=" + created + ", updated=" + updated + ", uuid=" + uuid + '}';
    }
    
    
}

