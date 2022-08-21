package com.porfolioApp.Porfolio.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Proyectos {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String nombre;
    private String logo;
    private String url;
    private String fecha;
    private String descripcion;

    public Proyectos() {
    }

    public Proyectos(Long id, String nombre, String logo, String url, 
            String fecha, String descripcion) {
        this.id = id;
        this.nombre = nombre;
        this.logo = logo;
        this.url = url;
        this.fecha = fecha;
        this.descripcion = descripcion;
    }
    
}
