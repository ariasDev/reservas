package com.reservas.Entity;

import java.sql.Date;
import java.sql.Time;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="reservas")
public class ReservasEntity {
	
	
	@Id
	@GeneratedValue(generator = "UUID")
	@GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
	@Column(name="id_reserva", unique = true, updatable = false, nullable = false)
	private UUID id_reserva;
	
	@Column(name = "usuario")
	private String usuario;
	 
	@Column(name = "barbero")
	private String barbero;
	
	@Column(name = "fecha")
	private Date fecha;
	
	@Column(name = "hora")
	private Time hora;
	
	@Column(name = "id_factura")
	private UUID id_factura;

	public ReservasEntity() {
		super();
	}

	public ReservasEntity(UUID id_reserva, String usuario, String barbero, Date fecha, Time hora, UUID id_factura) {
		super();
		this.id_reserva = id_reserva;
		this.usuario = usuario;
		this.barbero = barbero;
		this.fecha = fecha;
		this.hora = hora;
		this.id_factura = id_factura;
	}

	public UUID getId_reserva() {
		return id_reserva;
	}

	public void setId_reserva(UUID id_reserva) {
		this.id_reserva = id_reserva;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getBarbero() {
		return barbero;
	}

	public void setBarbero(String barbero) {
		this.barbero = barbero;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Time getHora() {
		return hora;
	}

	public void setHora(Time hora) {
		this.hora = hora;
	}

	public UUID getId_factura() {
		return id_factura;
	}

	public void setId_factura(UUID id_factura) {
		this.id_factura = id_factura;
	}

	
}
