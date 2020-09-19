package com.sum.alumno.models.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "infpersonal")
public class InformacionPersonal implements Serializable{
		
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idinfpersonal;
	private String dni;
	private String estadocivil;
	private String sexo;
	private String fechanacimiento;
	private String lugarnacimiento;
	private String telefono;
	private String celular;
	private String correoinstitucional;
	private String correopersonal;
	private String domicilio;
	private String direccion;		
	
	public InformacionPersonal() {
		super();
	}
	public InformacionPersonal(Long idinfpersonal, String dni, String estadocivil, String sexo, String fechanacimiento,
			String lugarnacimiento, String telefono, String celular, String correoinstitucional, String correopersonal,
			String domicilio, String direccion) {
		super();
		this.idinfpersonal = idinfpersonal;
		this.dni = dni;
		this.estadocivil = estadocivil;
		this.sexo = sexo;
		this.fechanacimiento = fechanacimiento;
		this.lugarnacimiento = lugarnacimiento;
		this.telefono = telefono;
		this.celular = celular;
		this.correoinstitucional = correoinstitucional;
		this.correopersonal = correopersonal;
		this.domicilio = domicilio;
		this.direccion = direccion;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getEstadocivil() {
		return estadocivil;
	}
	public void setEstadocivil(String estadocivil) {
		this.estadocivil = estadocivil;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getFechanacimiento() {
		return fechanacimiento;
	}
	public void setFechanacimiento(String fechanacimiento) {
		this.fechanacimiento = fechanacimiento;
	}
	public String getLugarnacimiento() {
		return lugarnacimiento;
	}
	public void setLugarnacimiento(String lugarnacimiento) {
		this.lugarnacimiento = lugarnacimiento;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
	public String getCorreoinstitucional() {
		return correoinstitucional;
	}
	public void setCorreoinstitucional(String correoinstitucional) {
		this.correoinstitucional = correoinstitucional;
	}
	public String getCorreopersonal() {
		return correopersonal;
	}
	public void setCorreopersonal(String correopersonal) {
		this.correopersonal = correopersonal;
	}
	public String getDomicilio() {
		return domicilio;
	}
	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public Long getIdinfpersonal() {
		return idinfpersonal;
	}
	public void setIdinfpersonal(Long idinfpersonal) {
		this.idinfpersonal = idinfpersonal;
	}
	
	
	
}
