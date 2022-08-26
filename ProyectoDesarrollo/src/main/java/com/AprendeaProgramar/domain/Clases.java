package com.AprendeaProgramar.domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Data;


@Data
@Entity
@Table(name="tab_horario")
public class Clases implements Serializable {
    //Para utilizarlo en la generación de la llave primaria autoincremental
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="hor_codigo")
    private Long horCodigo;

    String horHora;
    String horServicio;
    
    @JoinColumn(name="bus_id", referencedColumnName="bus_id")
    @ManyToOne
    private Curso tabBus;
    
    @JoinColumn(name="rut_id", referencedColumnName="rut_id")
    @ManyToOne
    private Lenguaje tabRuta;
            
    public Clases (){

    }

    public Clases(String horHora, String horServicio, Curso tabBus, Lenguaje tabRuta) {
        this.horHora = horHora;
        this.horServicio = horServicio;
        this.tabBus = tabBus;
        this.tabRuta = tabRuta;
    }

    

    
}
