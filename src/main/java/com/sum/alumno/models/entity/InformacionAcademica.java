package com.sum.alumno.models.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "infacademica")
public class InformacionAcademica implements Serializable{
		
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idinfacademica;
	private String anoingreso;
	private String modalidadingreso;
	private String colegioprocedencia;
	private String anoyciclo;
	private String promedioponderado;
	private String situacionacademica;
	private String estadopermanencia;
	private String ultimamatricula;
	private String promedioultimamatricula;
	@OneToOne
	@JoinColumn(name = "idalumno")
	private Alumno idalumno;
	public Long getIdinfacademica() {
		return idinfacademica;
	}
	public void setIdinfacademica(Long idinfacademica) {
		this.idinfacademica = idinfacademica;
	}
	public String getAnoingreso() {
		return anoingreso;
	}
	public void setAnoingreso(String anoingreso) {
		this.anoingreso = anoingreso;
	}
	public String getModalidadingreso() {
		return modalidadingreso;
	}
	public void setModalidadingreso(String modalidadingreso) {
		this.modalidadingreso = modalidadingreso;
	}
	
	public String getColegioprocedencia() {
		return colegioprocedencia;
	}
	public void setColegioprocedencia(String colegioprocedencia) {
		this.colegioprocedencia = colegioprocedencia;
	}
	public String getAnoyciclo() {
		return anoyciclo;
	}
	public void setAnoyciclo(String anoyciclo) {
		this.anoyciclo = anoyciclo;
	}
	public String getPromedioponderado() {
		return promedioponderado;
	}
	public void setPromedioponderado(String promedioponderado) {
		this.promedioponderado = promedioponderado;
	}
	public String getSituacionacademica() {
		return situacionacademica;
	}
	public void setSituacionacademica(String situacionacademica) {
		this.situacionacademica = situacionacademica;
	}
	public String getEstadopermanencia() {
		return estadopermanencia;
	}
	public void setEstadopermanencia(String estadopermanencia) {
		this.estadopermanencia = estadopermanencia;
	}
	public String getUltimamatricula() {
		return ultimamatricula;
	}
	public void setUltimamatricula(String ultimamatricula) {
		this.ultimamatricula = ultimamatricula;
	}
	public String getPromedioultimamatricula() {
		return promedioultimamatricula;
	}
	public void setPromedioultimamatricula(String promedioultimamatricula) {
		this.promedioultimamatricula = promedioultimamatricula;
	}
	public Alumno getIdalumno() {
		return idalumno;
	}
	public void setIdalumno(Alumno idalumno) {
		this.idalumno = idalumno;
	}
	
	
}
