package com.Proyecto.dao;

import com.Proyecto.domain.Articulo;
import org.springframework.data.repository.CrudRepository;

public interface ArticuloDao extends CrudRepository<Articulo, Long>{
    
}
