package business;


import jakarta.annotation.PostConstruct;
import jakarta.ejb.Singleton;
import jakarta.ejb.Startup;

import java.util.List;

import dao.VehiculoDAO;
import jakarta.inject.Inject;
import model.Vehiculo;

@Singleton
@Startup
public class Inicio {
	
	@Inject
	private VehiculoDAO vehiculoDAO;
	
	@PostConstruct
	public void init() {
		System.out.println("----------------Vehiculo----------------");
		
		Vehiculo vehiculo = new Vehiculo();
		vehiculo.setPlaca("ABC-123"); 
		vehiculo.setTipo("Camioneta"); 
		
		vehiculoDAO.agregarVehiculo(vehiculo);
		
		vehiculo = new Vehiculo();
		vehiculo.setPlaca("FGH-456"); 
		vehiculo.setTipo("Compacto"); 
		
		vehiculoDAO.agregarVehiculo(vehiculo);
		
		List<Vehiculo> listado = vehiculoDAO.getVehiculos();
		
		for(Vehiculo vehi: listado) {
			System.out.println(vehi.toString());
		}
		
	}

}
