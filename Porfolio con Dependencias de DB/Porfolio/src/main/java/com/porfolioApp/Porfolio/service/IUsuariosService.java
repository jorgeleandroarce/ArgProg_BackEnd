package com.porfolioApp.Porfolio.service;

import com.porfolioApp.Porfolio.model.Usuarios;
import java.util.List;

public interface IUsuariosService {
    
    public List<Usuarios> verUsuarios();
    
    public void crearUsuarios (Usuarios usu);
    
    public void borrarUsuarios (Long id); 
    
    public void editarUsuarios (Usuarios usu);
    
}