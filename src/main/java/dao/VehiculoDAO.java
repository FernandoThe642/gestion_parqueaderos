package dao;



import java.util.List;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import model.Vehiculo;


@Stateless
public class VehiculoDAO {

	@PersistenceContext
	private EntityManager em;
	
	
	public void agregarVehiculo(Vehiculo vehiculo) {
		em.persist(vehiculo);
	}
	
	public Vehiculo encontrarVehiculo(int idVehiculo) {
		return em.find(Vehiculo.class, idVehiculo);
	}
	
	public void eliminarVehiculo(int idVehiculo) {
		Vehiculo vehiculo = em.find(Vehiculo.class, idVehiculo);
	}
	
	public List<Vehiculo> getVehiculos() {
		String jpql = "SELECT v FROM Vehiculo v";
		Query query = em.createQuery(jpql, Vehiculo.class);
		
		List<Vehiculo> list = query.getResultList();
		
		return list;
	}


		
	

}
