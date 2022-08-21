package com.porfolioApp.Porfolio.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Usuarios {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String nombre;
    private String contraseña;
    private String email;
    
 
    public Usuarios() {
    }

    public Usuarios(Long id, String nombre, String contraseña, String email) {
        this.id = id;
        this.nombre = nombre;
        this.contraseña = contraseña;
        this.email = email;
    }
}
