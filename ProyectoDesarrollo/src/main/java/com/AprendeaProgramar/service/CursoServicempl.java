package com.AprendeaProgramar.service;

import com.AprendeaProgramar.domain.Curso;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import com.AprendeaProgramar.dao.CursoDao;


@Service
public class CursoServicempl implements CursoService{
    
    //Se crea en tiempo de ejecución si aún no se ha creado...
    @Autowired
    private CursoDao tabBusDao;
    
    @Override
    @Transactional(readOnly = true)
    public List<Curso> getTabBuses() {
        var lista = (List<Curso>) tabBusDao.findAll();
        return lista;
    }

    @Override
    @Transactional
    public void save(Curso tabBus) {
        tabBusDao.save(tabBus);
    }

    @Override
    @Transactional
    public void delete(Curso tabBus) {
        tabBusDao.delete(tabBus);
    }

    @Override
    @Transactional(readOnly = true)
    public Curso getTabBus(Curso tabBus) {
        return tabBusDao.findById(tabBus.getBusId()).orElse(null);
    }
    
    
}
