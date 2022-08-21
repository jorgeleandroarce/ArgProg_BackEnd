package com.porfolioApp.Porfolio.controller;

import com.porfolioApp.Porfolio.model.Educacion;
import com.porfolioApp.Porfolio.model.Experiencia;
import com.porfolioApp.Porfolio.model.HabilidadesHard;
import com.porfolioApp.Porfolio.model.HabilidadesSoft;
import com.porfolioApp.Porfolio.model.Persona;
import com.porfolioApp.Porfolio.model.Proyectos;
import com.porfolioApp.Porfolio.model.Usuarios;
import com.porfolioApp.Porfolio.service.IEducacionService;
import com.porfolioApp.Porfolio.service.IExperienciaService;
import com.porfolioApp.Porfolio.service.IHabilidadesHardService;
import com.porfolioApp.Porfolio.service.IHabilidadesSoftService;
import com.porfolioApp.Porfolio.service.IPersonaService;
import com.porfolioApp.Porfolio.service.IProyectosService;
import com.porfolioApp.Porfolio.service.IUsuariosService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController 
public class Controller {
    
//////////////COMIENZA Controller Persona////////////////////
  
  @Autowired
  private IPersonaService persoServ;
  
  @PostMapping ("/new/persona")
  public void agregarPersona (@RequestBody Persona per) {
      persoServ.crearPersona(per);
  }
  
  @GetMapping ("/ver/persona")
  @ResponseBody
  public List<Persona> verPersona() {
      return persoServ.verPersona();
  }
  
  @DeleteMapping ("/delete/persona/{id}")
  public void borrarPersona (@PathVariable Long id) {
      persoServ.borrarPersona(id);
    }
  
  @PutMapping ("/editar/persona")
  public void editarPersona (@RequestBody Persona per) {
      persoServ.editarPersona(per);
    }

//////////////COMIENZA Controller Educacion////////////////////        
    
  @Autowired
  private IEducacionService eduServ;
   
  @PostMapping ("/new/educacion")
  public void agregarEducacion (@RequestBody Educacion edu) {
      eduServ.crearEducacion(edu);
  }
  
  @GetMapping ("/ver/educacion")
  @ResponseBody
  public List<Educacion> verEducacion() {
      return eduServ.verEducacion();
  }
   
  @DeleteMapping ("/delete/educacion/{id}")
  public void borrarEducacion (@PathVariable Long id) {
      eduServ.borrarEducacion(id);
    }
  
  @PutMapping ("/editar/educacion")
  public void editarEducacion (@RequestBody Educacion edu) {
      eduServ.editarEducacion(edu);
    }
  
//////////////COMIENZA Controller Experiencia////////////////////
  
  @Autowired
  private IExperienciaService expServ;
  
  @PostMapping ("/new/experiencia")
  public void agregarExperiencia (@RequestBody Experiencia exp) {
      expServ.crearExperiencia(exp);
  }
  
  @GetMapping ("/ver/experiencia")
  @ResponseBody
  public List<Experiencia> verExperiencia() {
      return expServ.verExperiencia();
  }
  
  @DeleteMapping ("/delete/experiencia/{id}")
  public void borrarExperiencia (@PathVariable Long id) {
      expServ.borrarExperiencia(id);
    }
  
  @PutMapping ("/editar/experiencia")
  public void editarExperiencia (@RequestBody Experiencia exp) {
      expServ.editarExperiencia(exp);
    }
  
  //////////////COMIENZA Controller Usuarios////////////////////
  
  @Autowired
  private IUsuariosService usuServ;
  
  @PostMapping ("/new/usuarios")
  public void agregarUsuarios (@RequestBody Usuarios usu) {
      usuServ.crearUsuarios(usu);
  }
  
  @GetMapping ("/ver/usuarios")
  @ResponseBody
  public List<Usuarios> verUsuarios() {
      return usuServ.verUsuarios();
  }
  
  @DeleteMapping ("/delete/usuarios/{id}")
  public void borrarUsuarios (@PathVariable Long id) {
      usuServ.borrarUsuarios(id);
    }
  
  @PutMapping ("/editar/usuarios")
  public void editarUsuarios (@RequestBody Usuarios usu) {
      usuServ.editarUsuarios(usu);
    }
  
  //////////////COMIENZA Controller Proyectos////////////////////
  
  @Autowired
  private IProyectosService proyServ;
  
  @PostMapping ("/new/proyectos")
  public void agregarProyectos (@RequestBody Proyectos proy) {
      proyServ.crearProyectos(proy);
  }
  
  @GetMapping ("/ver/proyectos")
  @ResponseBody
  public List<Proyectos> verProyectos() {
      return proyServ.verProyectos();
  }
  
  @DeleteMapping ("/delete/proyectos/{id}")
  public void borrarProyectos (@PathVariable Long id) {
      proyServ.borrarProyectos(id);
    }
  
  @PutMapping ("/editar/proyectos")
  public void editarProyectos (@RequestBody Proyectos proy) {
      proyServ.editarProyectos(proy);
    }
  
  //////////////COMIENZA Controller HabilidadesHard////////////////////
  
  @Autowired
  private IHabilidadesHardService habhServ;
  
  @PostMapping ("/new/habilidadeshard")
  public void agregarHabilidadesHard (@RequestBody HabilidadesHard habh) {
      habhServ.crearHabilidadesHard(habh);
  }
  
  @GetMapping ("/ver/habilidadeshard")
  @ResponseBody
  public List<HabilidadesHard> verHabilidadesHard() {
      return habhServ.verHabilidadesHard();
  }
  
  @DeleteMapping ("/delete/habilidadeshard/{id}")
  public void borrarHabilidadesHard (@PathVariable Long id) {
      habhServ.borrarHabilidadesHard(id);
    }
  
  @PutMapping ("/editar/habilidadeshard")
  public void editarHabilidadesHard (@RequestBody HabilidadesHard habh) {
      habhServ.editarHabilidadesHard(habh);
    }
  
  //////////////COMIENZA Controller HabilidadesSoft////////////////////
  
  @Autowired
  private IHabilidadesSoftService habsServ;
  
  @PostMapping ("/new/habilidadessoft")
  public void agregarHabilidadesSoft (@RequestBody HabilidadesSoft habs) {
      habsServ.crearHabilidadesSoft(habs);
  }
  
  @GetMapping ("/ver/habilidadessoft")
  @ResponseBody
  public List<HabilidadesSoft> verHabilidadesSoft() {
      return habsServ.verHabilidadesSoft();
  }
  
  @DeleteMapping ("/delete/habilidadessoft/{id}")
  public void borrarHabilidadesSoft (@PathVariable Long id) {
      habsServ.borrarHabilidadesSoft(id);
    }
  
  @PutMapping ("/editar/habilidadessoft")
  public void editarHabilidadesSoft (@RequestBody HabilidadesSoft habs) {
      habsServ.editarHabilidadesSoft(habs);
    }

}

