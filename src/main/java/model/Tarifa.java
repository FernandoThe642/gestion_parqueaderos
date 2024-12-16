package model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Tarifa {

    @Id
    private String id;
    private String tipoVehiculo;
    private double precio;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTipoVehiculo() {
		return tipoVehiculo;
	}
	public void setTipoVehiculo(String tipoVehiculo) {
		this.tipoVehiculo = tipoVehiculo;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
    
    
}