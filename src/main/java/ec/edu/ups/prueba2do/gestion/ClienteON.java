package ec.edu.ups.prueba2do.gestion;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;

import ec.edu.ups.prueba2do.dao.ClienteDAO;
import ec.edu.ups.prueba2do.model.Cliente;

@Named
public class ClienteON {
	@Inject
	private ClienteDAO cdao;
	
	public boolean crear(Cliente cliente) {
		boolean estado = false;
		try {
			estado = cdao.insert(cliente);
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			return estado;
		}
	}
	/*public Cliente buscar(String cedula) {
		Cliente cliente = new Cliente();
		try {
			cliente = cdao.buscar(cedula);
		} catch (Exception e) {
		}finally {
			return cliente;
		}
	}*/
}
