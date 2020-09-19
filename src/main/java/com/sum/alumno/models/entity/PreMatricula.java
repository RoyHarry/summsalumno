package com.sum.alumno.models.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "matricula")
public class PreMatricula implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idmatricula;
	private String ciclo;
	private String codigo;
	private String asignatura;
	private String credito;
	private String seccion;
	private String docenteasignado;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "idalumno")
	private Alumno idalumno;
	public Long getIdmatricula() {
		return idmatricula;
	}
	public void setIdmatricula(Long idmatricula) {
		this.idmatricula = idmatricula;
	}
	public String getCiclo() {
		return ciclo;
	}
	public void setCiclo(String ciclo) {
		this.ciclo = ciclo;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getAsignatura() {
		return asignatura;
	}
	public void setAsignatura(String asignatura) {
		this.asignatura = asignatura;
	}
	public String getCredito() {
		return credito;
	}
	public void setCredito(String credito) {
		this.credito = credito;
	}
	public String getSeccion() {
		return seccion;
	}
	public void setSeccion(String seccion) {
		this.seccion = seccion;
	}
	public String getDocenteasignado() {
		return docenteasignado;
	}
	public void setDocenteasignado(String docenteasignado) {
		this.docenteasignado = docenteasignado;
	}
	public Alumno getIdalumno() {
		return idalumno;
	}
	public void setIdalumno(Alumno idalumno) {
		this.idalumno = idalumno;
	}
	
	
}
