package model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Ticket {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
    private java.util.Date fechaInicio;
    private java.util.Date fechaFin;
    private double total;
    
    //Relación Unidireccional one-to-one con Ticket
    @OneToOne
    @JoinColumn(name = "usuario_id") // Clave foránea
    private Usuario usuario;
    
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