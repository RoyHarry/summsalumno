package com.sum.alumno.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sum.alumno.models.dao.AlumnoDao;
import com.sum.alumno.models.dao.InformacionAcademicaDao;
import com.sum.alumno.models.dao.InformacionPersonalDao;
import com.sum.alumno.models.dao.PreMatriculaDao;
import com.sum.alumno.models.entity.Alumno;
import com.sum.alumno.models.entity.InformacionAcademica;
import com.sum.alumno.models.entity.InformacionPersonal;
import com.sum.alumno.models.entity.PreMatricula;

@Service
public class AlumnoServiceImpl implements IAlumnoService{
	
	@Autowired
	private AlumnoDao alumnoDao;
	
	@Autowired
	private InformacionPersonalDao informacionPersonalDao;
	
	@Autowired
	private InformacionAcademicaDao informacionAcademicaDao;
	
	@Autowired
	private PreMatriculaDao preMatriculaDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<Alumno> findAll() {
		
		return (List<Alumno>) alumnoDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Alumno buscarAlumnoById(Long id) {
		
		return alumnoDao.findById(id).orElse(null);
	}

	@Override
	public List<InformacionPersonal> findAllInfoPersonal() {
		return (List<InformacionPersonal>) informacionPersonalDao.findAll();
	}

	@Override
	public InformacionPersonal findByIdInfoPersonal(Long id) {
		return informacionPersonalDao.findById(id).orElse(null);
	}

	@Override
	public List<InformacionAcademica> findAllInfoAcademica() {
		return (List<InformacionAcademica>) informacionAcademicaDao.findAll();
	}

	@Override
	public InformacionAcademica findByIdInfoAcademica(Long id) {
		return informacionAcademicaDao.findById(id).orElse(null);
	}

	@Override
	public List<PreMatricula> findAllInfoPreMatricula() {
		return (List<PreMatricula>) preMatriculaDao.findAll();
	}

	@Override
	public PreMatricula findByIdPreMatricula(Long id) {
		return preMatriculaDao.findById(id).orElse(null);
	}

	@Override
	public InformacionPersonal guardarInfoPersonal(InformacionPersonal informacionPersonal) {
		return informacionPersonalDao.save(informacionPersonal);
	}

	@Override
	public Alumno guardarAlumno(Alumno alumno) {
		return alumnoDao.save(alumno);
	}

	@Override
	public InformacionPersonal actualizarInfoPersonal(InformacionPersonal informacionPersonal) {
		
		return informacionPersonalDao.save(informacionPersonal);
	}

	@Override
	public void eliminarInfoPersonal(Long id) {
		informacionPersonalDao.deleteById(id);
	}

	@Override
	public void eliminarAlumno(Long id) {
		alumnoDao.deleteById(id);
	}

	

}
