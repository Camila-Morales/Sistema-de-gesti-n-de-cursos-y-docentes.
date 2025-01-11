package com.espe.cursos.repositories;

import org.springframework.data.repository.CrudRepository;
import com.espe.cursos.model.entity.Estudiante;

public interface EstudianteRepository extends CrudRepository<Estudiante, Long> {
}
