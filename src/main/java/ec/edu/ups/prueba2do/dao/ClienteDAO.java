package ec.edu.ups.prueba2do.dao;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import ec.edu.ups.prueba2do.model.Cliente;

@Stateless
public class ClienteDAO {
	@Inject
	private EntityManager em;
	
	public boolean insert(Cliente cliente) throws Exception {
		boolean estado = false;
		try {
			em.persist(cliente);
			estado = true;
		} catch (Exception e) {
			new Exception("error insert dao"+e.getLocalizedMessage());
			estado = false;
		}finally {
			return estado;
		}
	}/*
	public Cliente buscar(String cedula) throws Exception {
		Cliente cliente = new Cliente();
		try {
			cliente = em.find(Cliente.class, cedula);
		} catch (Exception e) {
			new Exception("Se ha generado un error busqueda dao"+e.getLocalizedMessage());
		}finally {
			return cliente;
		}
	}*/
}
