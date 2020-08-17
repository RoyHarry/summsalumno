package com.sum.alumno.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.sum.alumno.models.entity.Alumno;
import com.sum.alumno.models.entity.InformacionAcademica;
import com.sum.alumno.models.entity.InformacionPersonal;
import com.sum.alumno.models.entity.PreMatricula;
import com.sum.alumno.models.service.IAlumnoService;

@RestController
public class AlumnoController {
	
	@Autowired
	private IAlumnoService alumnoService;
	
	@GetMapping("/listar")
	public List<Alumno> listar(){
		return alumnoService.findAll();
	}
	
	@GetMapping("/ver/{id}")
	public Alumno detalle(@PathVariable Long id){
		return alumnoService.findById(id);
	}
	
	@GetMapping("/listarInformacionPersonal")
	public List<InformacionPersonal> listarInfoPersonal(){
		return alumnoService.findAllInfoPersonal();
	}
	
	@GetMapping("/verInfoPersonal/{id}")
	public InformacionPersonal detalleInfoPersonal(@PathVariable Long id){
		return alumnoService.findByIdInfoPersonal(id);
	}
	
	@GetMapping("/listarInformacionAcademica")
	public List<InformacionAcademica> listarInfoAcademica(){
		return alumnoService.findAllInfoAcademica();
	}
	
	@GetMapping("/verInfoAcademica/{id}")
	public InformacionAcademica detalleInfoAcademica(@PathVariable Long id){
		return alumnoService.findByIdInfoAcademica(id);
	}
	
	@GetMapping("/listarPreMatricula")
	public List<PreMatricula> listarPreMatricula(){
		return alumnoService.findAllInfoPreMatricula();
	}
	
	@GetMapping("/verPreMatricula/{id}")
	public PreMatricula detallePreMatricula(@PathVariable Long id){
		return alumnoService.findByIdPreMatricula(id);
	}
}
