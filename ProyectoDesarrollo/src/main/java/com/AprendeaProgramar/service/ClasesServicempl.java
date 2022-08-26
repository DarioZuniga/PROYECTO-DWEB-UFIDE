package com.AprendeaProgramar.service;

import com.AprendeaProgramar.domain.Clases;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import com.AprendeaProgramar.dao.ClasesDao;


@Service
public class ClasesServicempl implements ClasesService{
    
    //Se crea en tiempo de ejecución si aún no se ha creado...
    @Autowired
    private ClasesDao tabHorarioDao;
    
    @Override
    @Transactional(readOnly = true)
    public List<Clases> getTabHorarioes() {
        var lista = (List<Clases>) tabHorarioDao.findAll();
        return lista;
    }

    @Override
    @Transactional
    public void save(Clases tabHorario) {
        tabHorarioDao.save(tabHorario);
    }

    @Override
    @Transactional
    public void delete(Clases tabHorario) {
        tabHorarioDao.delete(tabHorario);
    }

    @Override
    @Transactional(readOnly = true)
    public Clases getTabHorario(Clases tabHorario) {
        return tabHorarioDao.findById(tabHorario.getHorCodigo()).orElse(null);
    }
    
    
}
