
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
@Table(name="tab_bus")
public class Curso implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="bus_id")
    private Long busId;
    
    Long busUnidad;

    int busCapacidad;
    
    @JoinColumn(name="rut_id", referencedColumnName="rut_id")
    @ManyToOne
    private Lenguaje tabRuta;

    public Curso() {
    }

    public Curso(Long busUnidad, int busCapacidad, Lenguaje tabRuta) {
        this.busUnidad = busUnidad;
        this.busCapacidad = busCapacidad;
        this.tabRuta = tabRuta;
    }

    
    
    
    
}
