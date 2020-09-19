package com.sum.alumno.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sum.alumno.models.entity.Alumno;
import com.sum.alumno.models.entity.InformacionAcademica;
import com.sum.alumno.models.entity.InformacionPersonal;
import com.sum.alumno.models.entity.PreMatricula;
import com.sum.alumno.models.service.IAlumnoService;

@CrossOrigin(origins = { "http://localhost:4200"})
@RestController
@RequestMapping("/apisum")
public class AlumnoController {
	
	@Autowired
	private IAlumnoService alumnoService;
	
	@GetMapping("/listar")
	public List<Alumno> listar(){
		return alumnoService.findAll();
	}
	
	@GetMapping("/ver/{id}")
	public Alumno detalle(@PathVariable Long id){
		return alumnoService.buscarAlumnoById(id);
	}
	
	@PostMapping("/guardarAlumno/")
	public Alumno guardarAlumno(@RequestBody Alumno alumno){
		return alumnoService.guardarAlumno(alumno);
	}
	
	@PutMapping("/actualizarAlumno/{id}")
	public Alumno actualizarAlumno(@PathVariable Long id, @RequestBody Alumno alumnoNuevo){
		
		Alumno alumnoActual =  alumnoService.buscarAlumnoById(id);
		alumnoActual.setCodigo(alumnoNuevo.getCodigo());
		alumnoActual.setPrimernombre(alumnoNuevo.getPrimernombre());
		alumnoActual.setSegundonombre(alumnoNuevo.getSegundonombre());
		alumnoActual.setApellidopaterno(alumnoNuevo.getApellidopaterno());
		alumnoActual.setApellidomaterno(alumnoNuevo.getApellidomaterno());
		alumnoActual.setPlanestudio(alumnoNuevo.getPlanestudio());
		alumnoActual.setPeriodoacademico(alumnoNuevo.getPeriodoacademico());		
		return alumnoService.guardarAlumno(alumnoActual);
	}
	
	@DeleteMapping("/eliminarAlumno/{id}")
	public void eliminarAlumno(@PathVariable Long id){
		alumnoService.eliminarAlumno(id);
	}
	
	
	
	@GetMapping("/listarInformacionPersonal")
	public List<InformacionPersonal> listarInfoPersonal(){
		return alumnoService.findAllInfoPersonal();
	}
	
	@GetMapping("/verInfoPersonal/{id}")
	public InformacionPersonal detalleInfoPersonal(@PathVariable Long id){
		return alumnoService.findByIdInfoPersonal(id);
	}
	
	@PostMapping("/guardarInfoPersonal/")
	public InformacionPersonal guardarInfoPersonal(@RequestBody InformacionPersonal inforPersonal){
		return alumnoService.guardarInfoPersonal(inforPersonal);
	}
	
	@PutMapping("/actualizarInfoPersonal/{id}")
	public InformacionPersonal actualizarInfoPersonal(@PathVariable Long id, @RequestBody InformacionPersonal inforPersonal){
		
		InformacionPersonal infoPersonalActual =  alumnoService.findByIdInfoPersonal(id);
		infoPersonalActual.setDni(inforPersonal.getDni());
		infoPersonalActual.setEstadocivil(inforPersonal.getEstadocivil());
		infoPersonalActual.setSexo(inforPersonal.getSexo());
		infoPersonalActual.setFechanacimiento(inforPersonal.getFechanacimiento());
		infoPersonalActual.setLugarnacimiento(inforPersonal.getLugarnacimiento());
		infoPersonalActual.setTelefono(inforPersonal.getTelefono());
		infoPersonalActual.setCelular(inforPersonal.getCelular());
		infoPersonalActual.setCorreoinstitucional(inforPersonal.getCorreoinstitucional());
		infoPersonalActual.setCorreopersonal(inforPersonal.getCorreopersonal());
		infoPersonalActual.setDomicilio(inforPersonal.getDomicilio());
		infoPersonalActual.setDireccion(inforPersonal.getDireccion());
		return alumnoService.actualizarInfoPersonal(infoPersonalActual);
	}
	
	@DeleteMapping("/eliminarInfoPersonal/{id}")
	public void eliminaInfoPersonal(@PathVariable Long id){
		alumnoService.eliminarInfoPersonal(id);
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
