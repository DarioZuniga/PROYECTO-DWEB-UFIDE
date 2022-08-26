package com.AprendeaProgramar.dao;

import com.AprendeaProgramar.domain.Curso;
import org.springframework.data.repository.CrudRepository;

public interface CursoDao extends CrudRepository<Curso, Long> {

}
