package com.sum.alumno.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.sum.alumno.models.entity.Alumno;

public interface AlumnoDao extends CrudRepository<Alumno, Long>{

}
