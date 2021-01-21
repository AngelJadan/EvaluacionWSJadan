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
@Table(name = "Cuotas", schema = "public")
public class Cuota implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@SequenceGenerator(name = "cuo_id_seq", sequenceName = "cuo_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "cuo_id_seq")
	@Column(name = "cuo_id", updatable = false, unique = true, nullable = false)
	@Id
	private long idCuota;
	
	@Column(name = "cuo_valor", nullable = false)
	private float valor;
	
	@Column(name = "cuo_fpago")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechaPago;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "cuo_fk_credito")
	private Credito credito;

	@Override
	public String toString() {
		return "Cuota [idCuota=" + idCuota + ", valor=" + valor + ", fechaPago=" + fechaPago + ", credito=" + credito
				+ "]";
	}
	
}
