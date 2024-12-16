package model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Ticket {

    @Id
    private int id;
    private java.util.Date fechaInicio;
    private java.util.Date fechaFin;
    private double total;
	public int getId() {
		return id;
	}
	public void setId(int id) {
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
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}

    
}