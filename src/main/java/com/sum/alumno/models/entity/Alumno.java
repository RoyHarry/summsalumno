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
@Table(name = "alumno")
public class Alumno implements Serializable{
	
	private static final long serialVersionUID = 271146932264451229L;
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idalumno;
	private String codigo;	
	private String primernombre;
	private String segundonombre;
	private String apellidopaterno;
	private String apellidomaterno;
	private String planestudio;
	private String periodoacademico;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "idinfpersonal")
	private InformacionPersonal idinfpersonal;	
	
	public Alumno() {
		super();
	}
	public Alumno(Long idalumno, String codigo, String primernombre, String segundonombre, String apellidopaterno,
			String apellidomaterno, String planestudio, String periodoacademico, InformacionPersonal idinfpersonal) {
		super();
		this.idalumno = idalumno;
		this.codigo = codigo;
		this.primernombre = primernombre;
		this.segundonombre = segundonombre;
		this.apellidopaterno = apellidopaterno;
		this.apellidomaterno = apellidomaterno;
		this.planestudio = planestudio;
		this.periodoacademico = periodoacademico;
		this.idinfpersonal = idinfpersonal;
	}
	public Long getIdalumno() {
		return idalumno;
	}
	public void setIdalumno(Long idalumno) {
		this.idalumno = idalumno;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getPrimernombre() {
		return primernombre;
	}
	public void setPrimernombre(String primernombre) {
		this.primernombre = primernombre;
	}
	public String getSegundonombre() {
		return segundonombre;
	}
	public void setSegundonombre(String segundonombre) {
		this.segundonombre = segundonombre;
	}
	public String getApellidopaterno() {
		return apellidopaterno;
	}
	public void setApellidopaterno(String apellidopaterno) {
		this.apellidopaterno = apellidopaterno;
	}
	public String getApellidomaterno() {
		return apellidomaterno;
	}
	public void setApellidomaterno(String apellidomaterno) {
		this.apellidomaterno = apellidomaterno;
	}
	public String getPlanestudio() {
		return planestudio;
	}
	public void setPlanestudio(String planestudio) {
		this.planestudio = planestudio;
	}
	public String getPeriodoacademico() {
		return periodoacademico;
	}
	public void setPeriodoacademico(String periodoacademico) {
		this.periodoacademico = periodoacademico;
	}
	public InformacionPersonal getIdinfpersonal() {
		return idinfpersonal;
	}
	public void setIdinfpersonal(InformacionPersonal idinfpersonal) {
		this.idinfpersonal = idinfpersonal;
	}
	
	
	
	
	
	
}
