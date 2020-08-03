package com.sum.alumno.models.service;

import java.util.List;

import com.sum.alumno.models.entity.Alumno;

public interface IAlumnoService {

	public List<Alumno> findAll();
	public Alumno findById(Long id);
}
