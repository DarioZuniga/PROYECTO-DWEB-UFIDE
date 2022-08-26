package com.AprendeaProgramar.service;

import com.AprendeaProgramar.domain.Curso;
import java.util.List;


public interface CursoService {
    
    public List<Curso> getTabBuses();
    
    public void save(Curso tabBus);
    
    public void delete(Curso tabBus);
    
    public Curso getTabBus(Curso tabBus);
    
}
