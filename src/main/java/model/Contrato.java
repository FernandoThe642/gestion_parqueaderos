package model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

//@Entity
public class Contrato{

    @Id
    private String id;
    private java.util.Date fechaInicio;
    private java.util.Date fechaFin;
    private double costoMensual;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public java.util.Date getFechaInicio() {
		return fechaInicio;
	}
	public void setFechaInicio(java.util.Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}
	public java.util.Date getFechaFin() {
		return fechaFin;
	}
	public void setFechaFin(java.util.Date fechaFin) {
		this.fechaFin = fechaFin;
	}
	public double getCostoMensual() {
		return costoMensual;
	}
	public void setCostoMensual(double costoMensual) {
		this.costoMensual = costoMensual;
	}
    
    
}