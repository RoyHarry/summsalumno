package com.sum.alumno.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sum.alumno.models.dao.AlumnoDao;
import com.sum.alumno.models.entity.Alumno;

@Service
public class AlumnoServiceImpl implements IAlumnoService{
	
	@Autowired
	private AlumnoDao alumnoDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<Alumno> findAll() {
		
		return (List<Alumno>) alumnoDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Alumno findById(Long id) {
		
		return alumnoDao.findById(id).orElse(null);
	}

}
