package com.AprendeaProgramar.service;

import com.AprendeaProgramar.domain.Lenguaje;
import java.util.List;


public interface LenguajeService {
    
    public List<Lenguaje> getTabRutaes();
    
    public void save(Lenguaje tabRuta);
    
    public void delete(Lenguaje tabRuta);
    
    public Lenguaje getTabRuta(Lenguaje tabRuta);
    
}
