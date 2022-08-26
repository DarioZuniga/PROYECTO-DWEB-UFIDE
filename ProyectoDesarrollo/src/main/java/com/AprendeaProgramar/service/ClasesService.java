package com.AprendeaProgramar.service;

import com.AprendeaProgramar.domain.Clases;
import java.util.List;


public interface ClasesService {
    
    public List<Clases> getTabHorarioes();
    
    public void save(Clases tabHorario);
    
    public void delete(Clases tabHorario);
    
    public Clases getTabHorario(Clases tabHorario);
    
}
