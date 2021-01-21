package ec.edu.ups.prueba2do.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "Creditos", schema = "public")
public class Credito implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "cre_id")
	@SequenceGenerator(name = "cre_id_seq", sequenceName = "cre_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "cre_id_seq")
	private long id;
	
	@Column(name = "cre_factual")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechaActual;
	
	@Column(name = "cre_fcredito")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechaCredito;
	
	@Column(name = "cre_monto", nullable = false)
	private float monto;
	@Column(name = "cre_meses", nullable = false)
	private int tiempoMes;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name = "cre_fk_cliente")
	private Cliente cliente;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getFechaActual() {
		return fechaActual;
	}

	public void setFechaActual(Date fechaActual) {
		this.fechaActual = fechaActual;
	}

	public Date getFechaCredito() {
		return fechaCredito;
	}

	public void setFechaCredito(Date fechaCredito) {
		this.fechaCredito = fechaCredito;
	}

	public float getMonto() {
		return monto;
	}

	public void setMonto(float monto) {
		this.monto = monto;
	}

	public int getTiempoMes() {
		return tiempoMes;
	}

	public void setTiempoMes(int tiempoDias) {
		this.tiempoMes = tiempoDias;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	@Override
	public String toString() {
		return "Credito [id=" + id + ", fechaActual=" + fechaActual + ", fechaCredito=" + fechaCredito + ", monto="
				+ monto + ", tiempoDias=" + tiempoMes + ", cliente=" + cliente + "]";
	}
}
