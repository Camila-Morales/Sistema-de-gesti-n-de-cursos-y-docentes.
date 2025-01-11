package com.espe.cursos.servicies;

import com.espe.cursos.model.entity.Estudiante;
import com.espe.cursos.repositories.EstudianteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EstudianteServiceImpl implements com.espe.cursos.services.EstudianteService {

    @Autowired
    private EstudianteRepository repository;

    @Override
    public List<Estudiante> findAll() {
        return (List<Estudiante>) repository.findAll();
    }

    @Override
    public Optional<Estudiante> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public Estudiante save(Estudiante estudiante) {
        return repository.save(estudiante);
    }

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
