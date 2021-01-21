package ec.edu.ups.prueba2do.service;

import javax.inject.Inject;
import javax.inject.Named;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import ec.edu.ups.prueba2do.model.Cliente;
import ec.ups.edu.sistemafinancieroLocal.gestion.GestionClienteON;

@WebService
public class ClienteSOAP {

	@Inject
	private GestionClienteON gcli;
	
	@WebMethod
	public String buscarClient(@WebParam(name = "Dni") String dni, @WebParam(name = "CuentaCliente") String cuenta){
		System.out.println("fun");
		return "";
	}
}
