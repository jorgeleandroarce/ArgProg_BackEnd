package com.porfolioApp.Porfolio.Dto;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class dtoPersona {
    
    private String imgportada;
    private String imgfoto;
    private String nombre;
    private String profesion;
    private String descripcion;
    private String instagram;
    private String telefono;
    private String e_mail;
    
    public dtoPersona() {
    }

    public dtoPersona(String imgportada, String imgfoto, String nombre, String profesion,
            String descripcion, String instagram, String telefono, String e_mail) {
        
        this.imgportada = imgportada;
        this.imgfoto = imgfoto;
        this.nombre = nombre;
        this.profesion = profesion;
        this.descripcion = descripcion;
        this.instagram = instagram;
        this.telefono = telefono;
        this.e_mail = e_mail;
    }
    
}
