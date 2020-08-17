package com.sum.alumno.models.service;

import java.util.List;

import com.sum.alumno.models.entity.Alumno;
import com.sum.alumno.models.entity.InformacionAcademica;
import com.sum.alumno.models.entity.InformacionPersonal;
import com.sum.alumno.models.entity.PreMatricula;

public interface IAlumnoService {

	public List<Alumno> findAll();
	public Alumno findById(Long id);
	
	public List<InformacionPersonal> findAllInfoPersonal();
	public InformacionPersonal findByIdInfoPersonal(Long id);
	
	public List<InformacionAcademica> findAllInfoAcademica();
	public InformacionAcademica findByIdInfoAcademica(Long id);
	
	public List<PreMatricula> findAllInfoPreMatricula();
	public PreMatricula findByIdPreMatricula(Long id);
}
